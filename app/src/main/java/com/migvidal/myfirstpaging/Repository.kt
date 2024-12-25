package com.migvidal.myfirstpaging

import kotlinx.serialization.json.Json

interface Repository {
    suspend fun getResultTitles(): List<String>
}

class NetworkRepository(val wikipediaApiService: WikipediaApiService) : Repository {
    override suspend fun getResultTitles(): List<String> {
        val searchResponse = wikipediaApiService.getSearch()
        return searchResponse.query.search.map { it.title }
    }
}

class FakeRepository : Repository {
    override suspend fun getResultTitles(): List<String> {
        val jsonCoder = Json { ignoreUnknownKeys = true }
        val searchResponse = jsonCoder.decodeFromString<SearchResponse>(fakeApiResponse)
        val results = searchResponse.query.search.map { it.title }
        return results
    }
}