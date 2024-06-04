package com.zulfen.zulfchat.common

import java.util.Date

// supports only text for now
data class Message(val sender: Profile, val content: String, val timestamp: Date)
