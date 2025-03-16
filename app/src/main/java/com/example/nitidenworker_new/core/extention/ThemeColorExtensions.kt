package com.example.nitidenworker_new.core.extention

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import com.example.nitidenworker_new.ui.theme.ClosingGrey
import com.example.nitidenworker_new.ui.theme.ApplyImageBorderColor
import com.example.nitidenworker_new.ui.theme.ApplyItemCategoryTextColor
import com.example.nitidenworker_new.ui.theme.RecruitingBlue
import com.example.nitidenworker_new.ui.theme.TopBarBorderColor
import com.example.nitidenworker_new.ui.theme.TrendingOrange

// ApplyItem
val MaterialTheme.recruitingColor: Color
    get() = RecruitingBlue

val MaterialTheme.trendingColor: Color
    get() = TrendingOrange

val MaterialTheme.closingColor: Color
    get() = ClosingGrey

val MaterialTheme.imageBorderColor: Color
    get() = ApplyImageBorderColor

val MaterialTheme.applyItemTextColor: Color
    get() = ApplyItemCategoryTextColor

// TopBar
val MaterialTheme.topBarBorderColor: Color
    get() = TopBarBorderColor