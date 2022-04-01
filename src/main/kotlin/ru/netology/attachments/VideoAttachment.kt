package ru.netology.attachments

import ru.netology.Attachment

data class VideoAttachment(
    override val type: String = "video",
    val video: Video
) : Attachment(type)