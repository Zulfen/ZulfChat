package com.zulfen.zulfchat.ui.screen.home

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.zulfen.zulfchat.ui.screen.home.composables.ContactBox

@Destination<RootGraph>(start = true)
@Composable
fun HomeScreen(navigator: DestinationsNavigator) {
    Messages()
}

@Composable
fun Messages() {
    LazyColumn(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        items(10) {
            ContactBox("Account $it", "Example message.")
            Divider(
                modifier = Modifier
                    .fillMaxWidth(0.95f),
                thickness = 1.dp,
                color = Color.Gray
            )
        }
    }
}