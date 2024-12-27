package com.migvidal.myfirstpaging.data

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.migvidal.myfirstpaging.model.SearchResponse
import com.migvidal.myfirstpaging.network.WikipediaApiService
import kotlin.math.max

private const val INITIAL_OFFSET = 0
const val ITEMS_PER_PAGE = 40

class ResultPagingSource(private val apiService: WikipediaApiService) :
    PagingSource<Int, SearchResponse>() {
    override fun getRefreshKey(state: PagingState<Int, SearchResponse>): Int? {
        val anchor = state.anchorPosition ?: return null
        val `continue` = state.closestItemToPosition(anchor)?.`continue` ?: return null
        return max(INITIAL_OFFSET, `continue`.sroffset)
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, SearchResponse> {
        val key = params.key ?: INITIAL_OFFSET
        try {
            Log.d("load()", "Key: ${params.key}")
            val searchResponse: SearchResponse = apiService.getSearch(
                query = "sonny",
                resultLimit = ITEMS_PER_PAGE,
                searchResultOffset = key
            )
            //val offset = searchResponse.`continue`?.sroffset ?: INITIAL_OFFSET
            val prevKey = if (key == INITIAL_OFFSET) null else key - ITEMS_PER_PAGE
            val page: LoadResult.Page<Int, SearchResponse> = LoadResult.Page(
                data = listOf(searchResponse),
                prevKey = prevKey,
                nextKey = key + ITEMS_PER_PAGE,
            )
            return page
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }
    }


}