package ru.netology

import ru.netology.exceptions.PostNotFoundException

class WallService {
    var posts = emptyArray <Post>()
    private var numId = 0
    var comments = emptyArray<Comment>()

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

    fun createComment(
        comment: Comment,
        ownerId: Int,
        postId: Int,
        fromGroup: Int? = null,
        message: String? = comment.text,
        replyToComment: Int? = null,
        attachment:Array<Attachment>? = comment.attachments,
        stickerId: Int? = null,
        guid: Int = 0
    ) {
        for ((index, postInArray) in posts.withIndex()) {
            if (postInArray.id == postId) {
                comments += comment
                return
            }
        }
        throw PostNotFoundException("Post not found")
    }
}