package ru.netology.attachments

import ru.netology.Attachment

data class DocAttachment(
    override val type: String = "doc",
    val doc: Doc
): Attachment(type)