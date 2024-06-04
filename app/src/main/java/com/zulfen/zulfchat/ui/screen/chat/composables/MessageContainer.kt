package com.zulfen.zulfchat.ui.screen.chat.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun MessageContainer(messageContent: String, timestamp: Date, isFromMe: Boolean) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 20.dp),
        horizontalArrangement = if (isFromMe) Arrangement.Start else Arrangement.End)
    {
        MessageBox(messageContent, timestamp, isFromMe)
    }
}

@Composable
fun MessageBox(messageContent: String, timestamp: Date, isFromMe: Boolean) {

    Box(
        modifier = Modifier
            .height(100.dp)
            .width(150.dp)
            .background(if (isFromMe) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = messageContent,
                color = Color.White,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.weight(1f))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                val formatter = SimpleDateFormat("HH:mm", Locale.getDefault())
                Text(
                    text = formatter.format(timestamp),
                    color = Color.White,
                    modifier = Modifier.padding(end = 8.dp)
                )
            }
        }
    }

}