package com.anshmidt.taglist.model.repository

import androidx.lifecycle.LiveData
import com.anshmidt.taglist.model.repository.room.NotesDatabase
import com.anshmidt.taglist.model.repository.room.dao.NoteDao
import com.anshmidt.taglist.model.repository.room.dao.NoteTagDao
import com.anshmidt.taglist.model.repository.room.dao.PriorityDao
import com.anshmidt.taglist.model.repository.room.dao.TagDao
import com.anshmidt.taglist.model.repository.room.entity.Note
import javax.inject.Inject

class NotesRepository @Inject constructor(
        val noteDao: NoteDao,
        val noteTagDao: NoteTagDao,
        val priorityDao: PriorityDao,
        val tagDao: TagDao
) {

    private val allNotes: LiveData<List<Note>>

    init {
        allNotes = noteDao.getAllNotes()
    }

    fun getAllNotes(): LiveData<List<Note>> {
        return allNotes
    }

}