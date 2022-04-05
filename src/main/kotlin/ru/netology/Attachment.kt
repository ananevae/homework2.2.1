package ru.netology

abstract class Attachment (
    open val type: String,
    val access_key: Int? = null
)