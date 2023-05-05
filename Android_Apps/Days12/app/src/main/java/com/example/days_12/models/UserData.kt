package com.example.days_12.models

data class UserData (
    val results: List<Result>,
    val info: Info
)

data class Info (
    val seed: String,
    val results: Long,
    val page: Long,
    val version: String
)

data class Result (
    val gender: Gender,
    val name: Name,
    val location: Location,
    val email: String,
    val login: Login,
    val dob: Dob,
    val registered: Dob,
    val phone: String,
    val cell: String,
    val id: ID,
    val picture: Picture,
    val nat: String
)

data class Dob (
    val date: String,
    val age: Long
)

enum class Gender {
    Female,
    Male
}

data class ID (
    val name: String,
    val value: String
)

data class Location (
    val street: Street,
    val city: String,
    val state: String,
    val country: String,
    val postcode: String,
    val coordinates: Coordinates,
    val timezone: Timezone
)

data class Coordinates (
    val latitude: String,
    val longitude: String
)


data class Street (
    val number: Long,
    val name: String
)

data class Timezone (
    val offset: String,
    val description: String
)

data class Login (
    val uuid: String,
    val username: String,
    val password: String,
    val salt: String,
    val md5: String,
    val sha1: String,
    val sha256: String
)

data class Name (
    val title: Title,
    val first: String,
    val last: String
)

enum class Title {
    Miss,
    Mr,
    Mrs
}

data class Picture (
    val large: String,
    val medium: String,
    val thumbnail: String
)
