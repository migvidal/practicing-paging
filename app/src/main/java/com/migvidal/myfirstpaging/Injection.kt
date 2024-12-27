package com.migvidal.myfirstpaging

import com.migvidal.myfirstpaging.data.NetworkRepository
import com.migvidal.myfirstpaging.network.WikipediaApiService
import com.migvidal.myfirstpaging.network.createApiService

object Injection {
    val repository = run {
        val wikipediaApiService: WikipediaApiService by lazy { createApiService() }
        NetworkRepository(wikipediaApiService)
    }
}