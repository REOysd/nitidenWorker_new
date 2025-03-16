package com.example.nitidenworker_new.common.composable.applyItem.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ApplyItemCard(
    titleText: String,
    categoryText: String,
    expectedCompleteDateText: Int,
    appliedUserCountText: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = modifier
            .height(106.dp)
            .fillMaxWidth()
    ) {
        ApplyItemContent(
            titleText = titleText,
            categoryText = categoryText,
            expectedCompleteDateText = expectedCompleteDateText,
            appliedUserCountText = appliedUserCountText
        )
    }
}