package com.zulfen.zulfchat.ui.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.zulfen.zulfchat.ui.common.CommonScaffolding
import com.zulfen.zulfchat.ui.screen.home.composables.ContactBox


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenContent() {
    CommonScaffolding(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary,
            ),
            title = {
                Text("ZulfChat")
            }
        )
    }, content = { Messages() })
}

@Composable
fun Messages() {
    LazyColumn(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        items(10) {
            ContactBox()
            Divider(
                modifier = Modifier.fillMaxWidth(0.95f),
                thickness = 1.dp,
                color = Color.Gray
            )
        }
    }
}