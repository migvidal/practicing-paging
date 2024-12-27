package com.migvidal.myfirstpaging.data

import com.migvidal.myfirstpaging.network.WikipediaApiService

interface Repository {
    fun getResultSource(): ResultPagingSource
}

class NetworkRepository(private val wikipediaApiService: WikipediaApiService) : Repository {
    override fun getResultSource() = ResultPagingSource(wikipediaApiService)
}

/*class FakeRepository : Repository {
    override suspend fun getResultPagingSource(): List<String> {
        val jsonCoder = Json { ignoreUnknownKeys = true }
        val searchResponse = jsonCoder.decodeFromString<SearchResponse>(fakeApiResponse)
        val results = searchResponse.query.search.map { it.title }
        return results
    }
}*/