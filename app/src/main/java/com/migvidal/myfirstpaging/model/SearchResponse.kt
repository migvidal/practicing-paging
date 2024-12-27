package com.migvidal.myfirstpaging.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@OptIn(ExperimentalUuidApi::class)
@Serializable
data class SearchResponse(
    @SerialName("batchcomplete")
    val batchComplete: String = "",
    val `continue`: Continue? = null,
    val query: SearchQuery = SearchQuery(),
    val id: String = Uuid.toString(),
) {
    @Serializable
    data class Continue(val sroffset: Int, val `continue`: String)

    @Serializable
    data class SearchQuery(
        @SerialName("searchinfo")
        val searchInfo: SearchInfo = SearchInfo(),
        val search: List<Search> = listOf()
    ) {
        @Serializable
        data class SearchInfo(
            @SerialName("totalhits") val totalHits: Int = 0
        )

        @Serializable
        data class Search(
            val ns: Int,
            val title: String,
            @SerialName("pageid")
            val pageId: Int,
            val size: Int,
            @SerialName("wordcount")
            val wordCount: Int,
            val snippet: String,
            @SerialName("timestamp")
            val timeStamp: String
        )
    }

}
