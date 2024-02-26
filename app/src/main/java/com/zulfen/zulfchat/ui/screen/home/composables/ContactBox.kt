package com.zulfen.zulfchat.ui.screen.home.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ContactBox() {

    Box(modifier = Modifier
        .fillMaxWidth()
        .height(80.dp)
        .padding(7.dp)
        .background(MaterialTheme.colorScheme.inversePrimary))
    {

        Row(modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start)
        {
            Text("Hi!")
        }


    }
}