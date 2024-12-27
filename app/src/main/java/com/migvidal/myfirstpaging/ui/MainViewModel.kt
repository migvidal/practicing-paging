package com.migvidal.myfirstpaging.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.migvidal.myfirstpaging.data.ITEMS_PER_PAGE
import com.migvidal.myfirstpaging.Injection
import com.migvidal.myfirstpaging.MyFirstPagingApplication
import com.migvidal.myfirstpaging.data.Repository
import com.migvidal.myfirstpaging.model.SearchResponse
import kotlinx.coroutines.flow.Flow

class MainViewModel(private val repository: Repository) : ViewModel() {
    val data: Flow<PagingData<SearchResponse>> = Pager(
        config = PagingConfig(pageSize = ITEMS_PER_PAGE, enablePlaceholders = false),
        pagingSourceFactory = {
            repository.getResultSource()
        }
    ).flow.cachedIn(viewModelScope)

    companion object {
        val factory = viewModelFactory {
            initializer {
                val application = this[APPLICATION_KEY] as MyFirstPagingApplication
                val repository = Injection.repository
                MainViewModel(repository)
            }
        }
    }
}