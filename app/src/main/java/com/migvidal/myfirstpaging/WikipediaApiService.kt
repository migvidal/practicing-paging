package com.migvidal.myfirstpaging

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

private val WIKIPEDIA_BASE_URL = "https://en.wikipedia.org/"

fun createApiService(): WikipediaApiService {
    val paramsInterceptor = Interceptor { chain ->
        var request = chain.request()
        val newUrl = request.url().newBuilder()
            .addPathSegments("")
            .addQueryParameter("action", "query")
            .addQueryParameter("format", "json")
            .build()
        request = request.newBuilder()
            .url(newUrl)
            .build()
        chain.proceed(request)
    }
    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(paramsInterceptor)
        .build()
    val retrofit = Retrofit.Builder()
        .baseUrl(WIKIPEDIA_BASE_URL)
        .client(okHttpClient)
        .build()
    return retrofit.create(WikipediaApiService::class.java)
}

interface WikipediaApiService {
    @GET("/")
    suspend fun getSearch(
        @Query("srsearch") query: String = "sonny",
        @Query("srlimit") resultLimit: Int = 60,
        @Query("list") list: String = "search"
    ): SearchResponse
}