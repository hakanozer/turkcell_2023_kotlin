package com.example.days_18.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note")
data class Note(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "nid")
    val nid: Int,

    val title:String?,
    val detail:String?,
    val number:Int?,

    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    val image:ByteArray?

)
