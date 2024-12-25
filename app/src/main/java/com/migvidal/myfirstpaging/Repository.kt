package com.migvidal.myfirstpaging

interface Repository {
    fun getData(): List<String>
}

class NetworkRepository(val networkApiService: NetworkApiService) : Repository {
    override fun getData(): List<String> {
        return networkApiService.getData()
    }
}

class FakeRepository : Repository {
    override fun getData(): List<String> {
        return (1..40).map {
            "Item $it"
        }
    }
}