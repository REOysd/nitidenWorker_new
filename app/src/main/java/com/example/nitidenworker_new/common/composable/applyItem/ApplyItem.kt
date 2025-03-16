package com.example.nitidenworker_new.common.composable.applyItem

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nitidenworker_new.common.composable.applyItem.component.ApplyItemCard
import com.example.nitidenworker_new.common.composable.applyItem.component.Signboard

@Composable
fun ApplyItem(
    signboardType: SignboardType,
    titleText: String,
    categoryText: String,
    expectedCompleteDateText: Int,
    appliedUserCountText: Int,
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(128.dp)
            .padding(horizontal = 16.dp,),
    ) {
        ApplyItemCard(
            titleText = titleText,
            categoryText = categoryText,
            expectedCompleteDateText = expectedCompleteDateText,
            appliedUserCountText = appliedUserCountText,
            onClick = onClick,
            modifier = Modifier.align(Alignment.Center)
        )

        Signboard(
            signboardType = signboardType,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(y = (1).dp, x = (15).dp)
        )
    }
}

@Preview
@Composable
fun ApplyItemPreview() {
    ApplyItem(
        signboardType = SignboardType.TRENDING,
        titleText = "作品のメインタイトル",
        categoryText = "モバイルアプリケーション開発",
        expectedCompleteDateText = 123,
        appliedUserCountText = 124,
        onClick = {}
    )
}