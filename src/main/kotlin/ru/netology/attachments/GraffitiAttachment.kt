package ru.netology.attachments

import ru.netology.Attachment

class GraffitiAttachment(
    type: String = "graffiti",
    val graffiti: Graffiti
): Attachment(type)