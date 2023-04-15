package com.example.days_6.services

import com.example.days_6.models.User

class UserService {

    fun userResult(): List<User> {
        var list = mutableListOf<User>()
        val u1 = User("Lonnie", "Stone", "lonnie.stone@example.com",54, "https://randomuser.me/api/portraits/men/36.jpg")
        val u2 = User("Munir", "Jesus", "munir.jesus@example.com",40, "https://randomuser.me/api/portraits/men/72.jpg")
        val u3 = User("Victoria", "Petersen", "victoria.petersen@example.com",33, "https://randomuser.me/api/portraits/women/89.jpg")
        val u4 = User("Lilje", "Kvame", "lilje.kvame@example.com",23, "https://randomuser.me/api/portraits/women/74.jpg")
        val u5 = User("Umut", "Kutlay", "umut.kutlay@example.com",27, "https://randomuser.me/api/portraits/men/54.jpg")
        val u10 = User("Lonnie", "Stone", "lonnie.stone@example.com",54, "https://randomuser.me/api/portraits/men/36.jpg")
        val u6 = User("Munir", "Jesus", "munir.jesus@example.com",40, "https://randomuser.me/api/portraits/men/72.jpg")
        val u7 = User("Victoria", "Petersen", "victoria.petersen@example.com",33, "https://randomuser.me/api/portraits/women/89.jpg")
        val u8 = User("Lilje", "Kvame", "lilje.kvame@example.com",23, "https://randomuser.me/api/portraits/women/74.jpg")
        val u9 = User("Umut", "Kutlay", "umut.kutlay@example.com",27, "https://randomuser.me/api/portraits/men/54.jpg")

        list.add(u1)
        list.add(u2)
        list.add(u3)
        list.add(u4)
        list.add(u5)
        list.add(u6)
        list.add(u7)
        list.add(u8)
        list.add(u9)
        list.add(u10)

        return list
    }

}