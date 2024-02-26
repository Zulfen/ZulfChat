package com.zulfen.zulfchat.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zulfen.zulfchat.ui.screen.home.HomeScreenContent

@Composable
fun NavigationManager() {
    val navigationController = rememberNavController()
    NavHost(navController = navigationController, startDestination = Screen.HomeScreen.route) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreenContent()
        }
    }
}