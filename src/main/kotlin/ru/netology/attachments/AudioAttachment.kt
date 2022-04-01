package ru.netology.attachments

import ru.netology.Attachment

data class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio
): Attachment(type)