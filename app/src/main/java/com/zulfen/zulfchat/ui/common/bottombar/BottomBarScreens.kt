package com.zulfen.zulfchat.ui.common.bottombar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.zulfen.zulfchat.ui.common.ScreenDescriptor

enum class BottomBarScreens(val icon: ImageVector, val screenDescriptor: ScreenDescriptor) {
    HomeScreen(Icons.Default.Home, ScreenDescriptor.HomeScreen)
}