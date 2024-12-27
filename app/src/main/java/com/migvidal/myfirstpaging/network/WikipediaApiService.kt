package com.migvidal.myfirstpaging.network

import com.migvidal.myfirstpaging.data.ITEMS_PER_PAGE
import com.migvidal.myfirstpaging.model.SearchResponse
import kotlinx.serialization.json.Json
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val WIKIPEDIA_BASE_URL = "https://en.wikipedia.org/"

private val jsonCoder = Json { ignoreUnknownKeys = true }

fun createApiService(): WikipediaApiService {
    val paramsInterceptor = Interceptor { chain ->
        var request = chain.request()
        val newUrl = request.url.newBuilder()
            .addPathSegments("w/api.php")
            .addQueryParameter("action", "query")
            .addQueryParameter("format", "json")
            .build()
        request = request.newBuilder()
            .url(newUrl)
            .build()
        chain.proceed(request)
    }
    val loggingInterceptor =
        HttpLoggingInterceptor().also { it.level = HttpLoggingInterceptor.Level.BASIC }
    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(paramsInterceptor)
        .addInterceptor(loggingInterceptor)
        .build()
    val retrofit = Retrofit.Builder()
        .baseUrl(WIKIPEDIA_BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(
            jsonCoder.asConverterFactory(
                "application/json; charset=UTF8".toMediaType()
            )
        )
        .build()
    return retrofit.create(WikipediaApiService::class.java)
}

interface WikipediaApiService {
    @GET("/")
    suspend fun getSearch(
        @Query("srsearch") query: String,
        @Query("srlimit") resultLimit: Int,
        @Query("list") list: String = "search",
        @Query("sroffset") searchResultOffset: Int = 0
    ): SearchResponse
}