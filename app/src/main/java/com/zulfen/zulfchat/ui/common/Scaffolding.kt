package com.zulfen.zulfchat.ui.common

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.ramcosta.composedestinations.spec.DestinationSpec
import com.ramcosta.composedestinations.spec.Route
import com.ramcosta.composedestinations.utils.currentDestinationAsState
import com.ramcosta.composedestinations.utils.startDestination


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZulfChatScaffolding(
    startRoute: Route,
    navController: NavHostController,
    bottomBar: @Composable (DestinationSpec) -> Unit,
    content: @Composable (PaddingValues) -> Unit,
) {
    val destination = navController.currentDestinationAsState().value
        ?: startRoute.startDestination
    //val navBackStackEntry = navController.currentBackStackEntry

    Scaffold(
        bottomBar = { bottomBar(destination) },
        content = content,
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(Icons.Default.Create, contentDescription = "New Chat")
            }
        }
    )

}
