package com.anshmidt.taglist.model.repository.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import com.anshmidt.taglist.model.repository.room.entity.Note

@Dao
interface NoteDao {
    fun getAllNotes(): LiveData<List<Note>>
}