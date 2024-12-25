package com.migvidal.myfirstpaging

object Injection {
    val repository = run {
        if (BuildConfig.BUILD_TYPE == "mocked") {
            FakeRepository()
        } else {
            val wikipediaApiService: WikipediaApiService by lazy { createApiService() }
            NetworkRepository(wikipediaApiService)
        }
    }
}