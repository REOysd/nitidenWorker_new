package com.example.nitidenworker_new.common.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.nitidenworker_new.R
import com.example.nitidenworker_new.common.navigation.DestinationRoute.FAVORITE_SCREEN_ROUTE
import com.example.nitidenworker_new.common.navigation.DestinationRoute.HOME_SCREEN_ROUTE
import com.example.nitidenworker_new.common.navigation.DestinationRoute.MESSAGE_SCREEN_ROUTE
import com.example.nitidenworker_new.common.navigation.DestinationRoute.MY_JOB_SCREEN_ROUTE
import com.example.nitidenworker_new.common.navigation.DestinationRoute.SEARCH_SCREEN_ROUTE

enum class BottomBarDestinationRoute(
    val route: String,
    @StringRes val title: Int,
    @DrawableRes val selectedIcon: Int,
    @DrawableRes val unSelectedIcon: Int
) {
    HOME(
        route = HOME_SCREEN_ROUTE,
        title = R.string.BottomBarDestinationRoute_home,
        selectedIcon = R.drawable.home_icon_black_by_icons8,
        unSelectedIcon = R.drawable.home_icon_by_icons8,
    ),

    SEARCH(
        route = SEARCH_SCREEN_ROUTE,
        title = R.string.BottomBarDestinationRoute_search,
        selectedIcon = R.drawable.search_icon_by_icons8,
        unSelectedIcon = R.drawable.search_icon_black_by_icons8,
    ),

    FAVORITE(
        route = FAVORITE_SCREEN_ROUTE,
        title = R.string.BottomBarDestinationRoute_favorite,
        selectedIcon = R.drawable.favorite_icon_black_by_icons8,
        unSelectedIcon = R.drawable.favorite_icon_by_icons8,
    ),

    MESSAGE(
        route = MESSAGE_SCREEN_ROUTE,
        title = R.string.BottomBarDestinationRoute_message,
        selectedIcon = R.drawable.message_icon_by_icons8,
        unSelectedIcon = R.drawable.message_icon_black_by_icons8,
    ),

    MYJOB(
        route = MY_JOB_SCREEN_ROUTE,
        title = R.string.BottomBarDestinationRoute_message,
        selectedIcon = R.drawable.job_icon_black_by_icons8,
        unSelectedIcon = R.drawable.job_icon_by_icons8,
    )
}