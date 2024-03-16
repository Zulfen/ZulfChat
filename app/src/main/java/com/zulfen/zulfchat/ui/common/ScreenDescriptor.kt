package com.zulfen.zulfchat.ui.common

import androidx.annotation.StringRes
import com.ramcosta.composedestinations.generated.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec
import com.zulfen.zulfchat.R

// the idea of a screen

open class ScreenDescriptor(val direction: DirectionDestinationSpec, @StringRes val label: Int) {
    object HomeScreen : ScreenDescriptor(HomeScreenDestination, R.string.home_screen_name)
}