package com.migvidal.myfirstpaging

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY

class MainViewModel(private val repository: Repository) : ViewModel() {
    private val _data: MutableStateFlow<List<String>> = MutableStateFlow(listOf())
    val data: StateFlow<List<String>>
        get() = _data.asStateFlow()

    private fun fetchData() {
        _data.update {
            repository.getData()
        }
    }

    init {
        fetchData()
    }

    companion object {
        val factory = viewModelFactory {
            initializer {
                val application = this[APPLICATION_KEY] as MyFirstPagingApplication
                val repository = application.injection.repository
                MainViewModel(repository)
            }
        }
    }
}