package com.mhmdawad.chatme.pojo

import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.HashMap

data class MainChatData (
    val chatID: String="",
    val lastMessage: String="",
    val lastMessageDate: String= SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault()).format(Date()),
    val unreadMessage: HashMap<String, String> = HashMap(),
    val usersPhone: HashMap<String, String> = HashMap(),
    val usersName: HashMap<String, String> = HashMap(),
    var offlineUserName: String="",
    val userImage: String=""
)