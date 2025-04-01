package com.example.nitidenworker_new.common.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nitidenworker_new.common.navigation.BottomBarDestinationRoute
import com.example.nitidenworker_new.core.extention.bottomNavigationBarColor

@Composable
fun BottomBar(
    navHostController: NavHostController,
    selectedItemIndex: Int,
    onSelectedItemIndexChange: (Int) -> Unit,
) {
    NavigationBar(
        containerColor = Color.White,
        tonalElevation = 14.dp,
        modifier = Modifier
            .border(
                width = 0.3.dp,
                color = Color.Gray
            )
    ) {
        BottomBarDestinationRoute.entries.forEachIndexed { index, bottomNavigationItems ->
            NavigationBarItem(
                selected = index == selectedItemIndex,
                onClick = {
                    onSelectedItemIndexChange(index)
                    navHostController.navigate(bottomNavigationItems.route)
                },
                icon = {
                    if (index == selectedItemIndex) {
                        Icon(
                            painter = painterResource(bottomNavigationItems.unSelectedIcon),
                            contentDescription = stringResource(bottomNavigationItems.title),
                            modifier = Modifier
                                .size(20.dp),
                            tint = MaterialTheme.bottomNavigationBarColor
                        )
                    } else {
                        Icon(
                            painter = painterResource(bottomNavigationItems.selectedIcon),
                            contentDescription = stringResource(bottomNavigationItems.title),
                            modifier = Modifier
                                .size(20.dp),
                            tint = Color.Gray
                        )
                    }
                },
                label = {
                    if (index == selectedItemIndex) {
                        Text(
                            text = stringResource(bottomNavigationItems.title),
                            color = MaterialTheme.bottomNavigationBarColor
                        )
                    } else {
                        Text(
                            text = stringResource(bottomNavigationItems.title),
                        )
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color.White
                ),
                modifier = Modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    val navHostController = rememberNavController()

    BottomBar(
        navHostController = navHostController,
        selectedItemIndex = 0,
        onSelectedItemIndexChange = {}
    )
}