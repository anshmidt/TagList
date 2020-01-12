package com.anshmidt.taglist.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.anshmidt.taglist.model.repository.NotesRepository
import com.anshmidt.taglist.model.repository.room.entity.Note
import javax.inject.Inject

class NotesViewModel(application: Application) : AndroidViewModel(application) {

    @Inject
    lateinit var repository: NotesRepository

    private var allNotes: LiveData<List<Note>> = repository.getAllNotes()

    fun getAllNotes(): LiveData<List<Note>> {
        return allNotes
    }

}