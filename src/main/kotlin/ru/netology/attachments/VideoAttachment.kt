package ru.netology.attachments

import ru.netology.Attachment

class VideoAttachment(
    type: String = "video",
    val video: Video
): Attachment(type)