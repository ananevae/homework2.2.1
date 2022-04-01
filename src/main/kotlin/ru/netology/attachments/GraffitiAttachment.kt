package ru.netology.attachments

import ru.netology.Attachment

data class GraffitiAttachment(
    override val type: String = "graffiti",
    val graffiti: Graffiti
): Attachment(type)
