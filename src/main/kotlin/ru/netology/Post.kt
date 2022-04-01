package ru.netology

import ru.netology.post.Comments
import ru.netology.post.Likes
import ru.netology.post.Reposts
import ru.netology.post.Views

data class Post(
    val id: Int? = null,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int? = null,
    val date: Int,
    val text: String? = null,
    val replyOwnerId: Int? = null,
    val replyPostId: Int? = null,
    val friendsOnly: Boolean = false,
    val comments: Comments? = null,
    val copyright: String? = null,
    val likes: Likes? = null,
    val reposts: Reposts? = null,
    val views: Views? = null,
    val postType: String = "post",
    val attachment: Array<Attachment>?,
    val signerId: Int? = null,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val postponnedId: Int? = null
)