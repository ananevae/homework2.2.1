package ru.netology.attachments

import ru.netology.Attachment

class DocAttachment(
    type: String = "doc",
    val doc: Doc
): Attachment(type)