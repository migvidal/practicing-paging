package com.migvidal.myfirstpaging.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemKey
import com.migvidal.myfirstpaging.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(title = { Text(text = stringResource(R.string.app_name)) })
        }
    ) { innerPadding ->
        val viewModel: MainViewModel = viewModel(factory = MainViewModel.factory)
        val pagingItems = viewModel.data.collectAsLazyPagingItems()
        if (pagingItems.itemCount == 0) return@Scaffold
        val results = pagingItems[0]?.query?.search ?: emptyList()
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            items(
                count = pagingItems.itemCount) { index: Int ->
                val element = pagingItems.get(index) ?: return@items
                Column {
                    element.query.search.forEach {
                        Text(text = it.title, modifier = Modifier.padding(16.dp))
                    }
                }
            }
        }
    }
}