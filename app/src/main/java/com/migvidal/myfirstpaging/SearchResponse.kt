package com.migvidal.myfirstpaging

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchResponse(
    @SerialName("batchcomplete") val batchComplete: String = "",
    val query: SearchQuery = SearchQuery()
) {
    @Serializable
    data class SearchQuery(
        @SerialName("searchinfo") val searchInfo: SearchInfo = SearchInfo(),
        val search: List<Search> = listOf()
    ) {
        @Serializable
        data class SearchInfo(
            /**
             * Number of results found. Zero if nothing was found
             */
            @SerialName("totalhits") val totalHits: Int = 0
        )

        @Serializable
        data class Search(
            val ns: Int,
            val title: String,
            @SerialName("pageid") val pageId: Int,
            val size: Int,
            @SerialName("wordcount") val wordCount: Int,
            val snippet: String,
            @SerialName("timestamp") val timeStamp: String
        )
    }

}
