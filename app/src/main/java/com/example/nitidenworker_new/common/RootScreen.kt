package com.example.nitidenworker_new.common

import android.provider.DocumentsContract.Root
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.nitidenworker_new.common.component.BottomBar
import com.example.nitidenworker_new.common.component.HomeTopBar
import com.example.nitidenworker_new.common.navigation.AppNavHost
import com.example.nitidenworker_new.ui.theme.NitidenWorker_newTheme

@Composable
fun RootScreen(
    viewModel: RootViewModel = RootViewModel(),
) {
    val navHostController = rememberNavController()
    val viewState by viewModel.viewState.collectAsState()

    NitidenWorker_newTheme {
        Scaffold(
            topBar = {
                HomeTopBar(
                    onClickToProfile = {}
                )
            },
            bottomBar = {
                BottomBar(
                    navHostController = navHostController,
                    selectedItemIndex = viewState.bottomBarIndex,
                    onSelectedItemIndexChange = {
                        viewModel.onTriggerEvent(RootEvent.OnBottomBarDestinationClick(it))
                    },
                )
            },
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            AppNavHost(
                navController = navHostController,
                modifier = Modifier.padding(innerPadding),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RootScreenPreview() {
    RootScreen()
}