package com.example.nitidenworker_new.common.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.nitidenworker_new.common.navigation.DestinationRoute.HOME_SCREEN_ROUTE
import com.example.nitidenworker_new.feature.home.homeNavGraph

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier,
    startDestination: String = HOME_SCREEN_ROUTE,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        homeNavGraph(navController = navController)
    }
}
