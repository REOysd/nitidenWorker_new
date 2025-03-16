package com.example.nitidenworker_new.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nitidenworker_new.common.composable.applyItem.ApplyItem
import com.example.nitidenworker_new.common.composable.applyItem.SignboardType

@Composable
fun Home() {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 12.dp),
    ) {
        items(10) { index ->
            ApplyItem(
                signboardType = when (index % 3) {
                    0 -> SignboardType.RECRUITING
                    1 -> SignboardType.TRENDING
                    else -> SignboardType.CLOSING
                },
                titleText = "タイトル ${index + 1}",
                categoryText = "カテゴリー ${index + 1}",
                expectedCompleteDateText = 30,
                appliedUserCountText = index + 1,
                onClick = {}
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    Home()
}