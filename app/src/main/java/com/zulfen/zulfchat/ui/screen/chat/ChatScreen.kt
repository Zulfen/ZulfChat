package com.zulfen.zulfchat.ui.screen.chat

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.zulfen.zulfchat.common.Message
import com.zulfen.zulfchat.common.Profile
import com.zulfen.zulfchat.ui.common.SharedViewModel
import com.zulfen.zulfchat.ui.screen.chat.composables.MessageContainer
import java.util.*

@Destination<RootGraph>
@Composable
fun ChatScreen(
    navigator: DestinationsNavigator,
    viewModel: SharedViewModel = hiltViewModel())
{
    val currentProfile = viewModel.currentProfile.value
    val messages: List<Message?> = listOf(
        currentProfile?.let { Message(it, "Hi", Date(1532358895)) },
        Message(Profile(UUID.randomUUID(),"Dude"), "Hello", Date(1532358895))
    )
    Column(modifier = Modifier.padding(10.dp)) {
        messages.forEach { message ->
            val isFromMe = currentProfile?.equals(message?.sender)
            isFromMe?.let {
                message?.let { it1 -> MessageContainer(message.content, it1.timestamp, it) }
            }
        }
    }
}