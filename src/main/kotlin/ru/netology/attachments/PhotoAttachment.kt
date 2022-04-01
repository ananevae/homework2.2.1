package ru.netology.attachments

import ru.netology.Attachment

class PhotoAttachment(
    type: String = "photo",
    val photo: Photo
): Attachment(type)