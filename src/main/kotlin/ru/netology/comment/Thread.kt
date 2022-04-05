package ru.netology.comment

import ru.netology.Comment

data class Thread(
    val count: Int,
    val items: Array<Comment>? = null,
    val canPost: Boolean,
    val showReplyButton: Boolean,
    val GroupsCanPost: Boolean
)