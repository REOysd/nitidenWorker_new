package com.example.nitidenworker_new.feature.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.nitidenworker_new.common.navigation.DestinationRoute.HOME_SCREEN_ROUTE

fun NavGraphBuilder.homeNavGraph(navController: NavController) {
    composable(
        route = HOME_SCREEN_ROUTE,
    ) { backStackEntry ->
        HomeScreen(navController = navController)
    }
}

fun navigateToHomeScreen(
    navController: NavController,
) {
    navController.navigate(HOME_SCREEN_ROUTE) {

    }

}