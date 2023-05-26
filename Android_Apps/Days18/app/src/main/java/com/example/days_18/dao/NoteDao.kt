package com.example.days_18.dao

import androidx.room.*
import com.example.days_18.models.Note

@Dao
interface NoteDao {

    @Insert
    fun insert( note: Note ) : Long

    @Query("select * from note")
    fun getAll() : List<Note>

    @Query("select * from note where title like :title ")
    fun searchTitle( title: String ) : List<Note>

    @Query("select * from note where nid =:nid")
    fun findById( nid: Int ) : Note

    @Delete
    fun delete(note: Note)

    @Update
    fun update( note: Note )


}