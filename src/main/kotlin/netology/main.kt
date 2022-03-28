package ru.netology

data class Post(
    val id: Int = 0,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int = 0,
    val date: Int,
    val text: String,
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: Comments = Comments(
        0,
        true,
        true,
        true,
        true),
    val copyright: String = "",
    val likes: Likes = Likes(
        0,
        true,
        true,
        true
    ),
    val reposts: Reposts = Reposts(
        0,
        true
    ),
    val views: Views = Views(0),
    val postType: String = "post",
    val signerId: Int = 0,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val postponnedId: Int = 0
)

data class Comments(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)

data class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
)

data class Reposts(
    val count: Int,
    val userReposted: Boolean
)

data class Views(
    val count: Int
)

class WallService {
    var posts = emptyArray <Post>()
    private var numId = 0

    fun add(post: Post): Post {
        numId += 1
        posts += post.copy(id = numId)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postInArray) in posts.withIndex()) {
            if (postInArray.id == post.id) {
                posts[index] = post.copy(ownerId = posts[index].ownerId, date = posts[index].date)
                return true
            }
        }
        return false
    }

    fun likeById(id: Int) {
        for ((index, post) in posts.withIndex()){
            if (post.id == id) {
                posts[index] = post.copy(likes = post.likes.copy (count = post.likes.count + 1))
            }
        }
    }
}

fun main() {

}
