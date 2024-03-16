package com.zulfen.zulfchat.ui.common.bottombar

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.ramcosta.composedestinations.generated.NavGraphs
import com.ramcosta.composedestinations.navigation.navigate
import com.ramcosta.composedestinations.navigation.popBackStack
import com.ramcosta.composedestinations.navigation.popUpTo
import com.ramcosta.composedestinations.utils.isRouteOnBackStack

@Composable
fun BottomBar(navController: NavHostController) {

    NavigationBar {
        BottomBarScreens.values().forEach { bottomBarScreen ->

            val descriptor = bottomBarScreen.screenDescriptor
            val direction = descriptor.direction

            // have we been here already?
            val isCurrentDestOnBackStack = navController.isRouteOnBackStack(direction)
            NavigationBarItem(
                selected = isCurrentDestOnBackStack,
                onClick = {
                    // we are already on this page, and we don't want to keep adding it to the backstack, so we
                    // pop to "return" to this destination and start with a clean slate.
                    if (isCurrentDestOnBackStack) {
                        navController.popBackStack(direction, false)
                        return@NavigationBarItem
                    }

                    navController.navigate(direction) {
                        // Pop up to the root of the graph to
                        // avoid building up a large stack of destinations
                        // on the back stack as users select items
                        popUpTo(NavGraphs.root) {
                            saveState = true
                        }

                        // Avoid multiple copies of the same destination when
                        // reselecting the same item
                        launchSingleTop = true
                        // Restore state when reselecting a previously selected item
                        restoreState = true
                    }
                },
                icon = {
                    Icon(bottomBarScreen.icon, contentDescription = stringResource(descriptor.label))
                },
                label = {
                    Text(stringResource(descriptor.label))
                }
            )
        }
    }

}