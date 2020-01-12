package com.anshmidt.taglist.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.anshmidt.taglist.R
import com.anshmidt.taglist.model.repository.room.entity.Note

class NotesListAdapter : RecyclerView.Adapter<NotesListAdapter.NoteHolder>() {
    private var notes: List<Note> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesListAdapter.NoteHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.note, parent, false)
        return NoteHolder(itemView)
    }

    override fun onBindViewHolder(holder: NotesListAdapter.NoteHolder, position: Int) {
        val currentNote = notes[position]
        holder.noteTextView.text = currentNote.text

    }

    fun setNotes(notes: List<Note>) {
        this.notes = notes
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    inner class NoteHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var noteTextView: TextView = itemView.findViewById(R.id.note_textview)
    }
}