package com.migvidal.myfirstpaging

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository) : ViewModel() {
    private val _data: MutableStateFlow<List<String>> = MutableStateFlow(listOf())
    val data: StateFlow<List<String>>
        get() = _data.asStateFlow()

    private fun fetchData() {
        viewModelScope.launch {
            _data.update {
                repository.getResultTitles()
            }
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