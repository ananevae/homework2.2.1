package netology

import org.junit.Test

import org.junit.Assert.*
import ru.netology.*

class WallServiceTest {

    @Test
    fun add() {
        // создаём целевой сервис
        val service = WallService()
        // добавляем пост
        service.add(Post(
            ownerId = 101,
            fromId = 101,
            date = 	1095370001,
            text = "Пост первый"
        ))
        // выполняем целевое действие
        var res = 0
        if (service.posts.last().id != 0) {
            res = 1
        }
        val result = res

        // проверяем результат
        assertEquals(1, result)
    }

    @Test
    fun updateExisting_post_found() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(
            ownerId = 101,
            fromId = 101,
            date = 	1095370001,
            text = "Пост первый"
        ))
        service.add(Post(
            ownerId = 102,
            fromId = 102,
            date = 	1095370002,
            text = "Пост второй"
        ))
        service.add(Post(
            ownerId = 101,
            fromId = 101,
            date = 	1095370003,
            text = "Пост третий"
        ))
        // создаём информацию об обновлении
        val update = Post(
            id = 2,
            ownerId = 103,
            fromId = 102,
            date = 	1095370002,
            text = "Пост второй, апдейт"
        )

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun updateExisting_post_not_found() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(
            ownerId = 101,
            fromId = 101,
            date = 	1095370001,
            text = "Пост первый"
        ))
        service.add(Post(
            ownerId = 102,
            fromId = 102,
            date = 	1095370002,
            text = "Пост второй"
        ))
        service.add(Post(
            ownerId = 101,
            fromId = 101,
            date = 	1095370003,
            text = "Пост третий"
        ))
        // создаём информацию об обновлении
        val update = Post(
            id = 5,
            ownerId = 103,
            fromId = 102,
            date = 	1095370002,
            text = "Пост второй, апдейт"
        )

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }
}