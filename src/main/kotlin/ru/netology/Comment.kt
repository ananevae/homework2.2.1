package ru.netology

import ru.netology.comment.Donut

data class Comment(
    val id: Int? = null,
    val fromId: Int,
    val date: Int,
    val text: String? = null,
    val donut: Donut? = null,
    val replyToUser: Int? = null,
    val replyToComment: Int? = null,
    val attachments: Array<Attachment>? = null,
    val parentStack: Array<Int>? = null,
    val thread: Thread? = null
)