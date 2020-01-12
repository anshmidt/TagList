package com.anshmidt.taglist.view.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.anshmidt.taglist.R
import com.anshmidt.taglist.model.repository.room.entity.Note
import com.anshmidt.taglist.view.adapter.NotesListAdapter
import com.anshmidt.taglist.viewmodel.NotesViewModel
import dagger.android.AndroidInjection

open class BaseActivity : AppCompatActivity() {

    private lateinit var notesViewModel: NotesViewModel
    private lateinit var notesListAdapter: NotesListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AndroidInjection.inject(this)

        val recyclerView = findViewById<RecyclerView>(R.id.notes_list_recycler_view)
        notesViewModel = ViewModelProviders.of(this).get(NotesViewModel::class.java)

        notesViewModel.getAllNotes().observe(
                this,
                Observer<List<Note>> {
                    t -> notesListAdapter.setNotes(t!!)
                }
        )
    }



}