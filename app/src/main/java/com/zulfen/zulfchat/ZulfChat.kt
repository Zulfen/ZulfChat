package com.zulfen.zulfchat

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.generated.NavGraphs
import com.zulfen.zulfchat.ui.common.ZulfChatScaffolding
import com.zulfen.zulfchat.ui.common.bottombar.BottomBar


@Composable
fun ZulfChat() {
    val navController = rememberNavController()
    val startRoute = NavGraphs.root.startRoute
    ZulfChatScaffolding(
        navController = navController,
        startRoute = startRoute,
        bottomBar = {
            BottomBar(navController)
        }
    ) {
        DestinationsNavHost(
            navController = navController,
            navGraph = NavGraphs.root,
            modifier = Modifier.padding(it).fillMaxSize(),
            startRoute = startRoute
        )
    }
}


