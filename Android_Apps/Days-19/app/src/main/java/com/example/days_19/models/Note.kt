package com.example.days_19.models


data class Note (
    val key: String,
    val value: NoteVal
)
data class NoteVal(
    val title: String = "",
    val detail: String = ""
)
