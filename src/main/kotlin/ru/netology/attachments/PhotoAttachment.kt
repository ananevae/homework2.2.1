package ru.netology.attachments

import ru.netology.Attachment

data class PhotoAttachment(
    override val type: String = "photo",
    val photo: Photo
): Attachment(type)

