package ru.netology

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
}