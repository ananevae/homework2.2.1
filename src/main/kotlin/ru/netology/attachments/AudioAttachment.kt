package ru.netology.attachments

import ru.netology.Attachment

class AudioAttachment(
    type: String = "audio",
    val audio: Audio
): Attachment(type)