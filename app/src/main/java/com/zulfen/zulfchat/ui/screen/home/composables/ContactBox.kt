package com.zulfen.zulfchat.ui.screen.home.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ContactBox(name: String, message: String) {

    Box(modifier = Modifier
        .height(80.dp)
        .padding(7.dp)) {

        Row(modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start)
        {
            Icon(Icons.Default.AccountBox, "Profile Picture", modifier = Modifier.size(50.dp))
            Column(modifier = Modifier
                .padding(vertical = 2.dp)
                .padding(start = 3.dp))
            {
                Text(name, fontWeight = FontWeight.Bold)
                Text(message, fontSize = 12.sp)
            }
        }


    }
}