package com.example.nitidenworker_new.common.composable.applyItem

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import com.example.nitidenworker_new.core.extention.closingColor
import com.example.nitidenworker_new.core.extention.recruitingColor
import com.example.nitidenworker_new.core.extention.trendingColor

enum class SignboardType(
    val text: String,
    val backgroundColor: Color
) {
    RECRUITING("現在募集中！", MaterialTheme.recruitingColor),
    TRENDING("急上昇中！", MaterialTheme.trendingColor),
    CLOSING("募集終了", MaterialTheme.closingColor),
}