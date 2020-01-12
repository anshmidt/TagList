package com.anshmidt.taglist.model.repository.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.anshmidt.taglist.model.repository.room.dao.NoteDao
import com.anshmidt.taglist.model.repository.room.dao.NoteTagDao
import com.anshmidt.taglist.model.repository.room.dao.PriorityDao
import com.anshmidt.taglist.model.repository.room.dao.TagDao
import com.anshmidt.taglist.model.repository.room.entity.Note
import com.anshmidt.taglist.model.repository.room.entity.NoteTag
import com.anshmidt.taglist.model.repository.room.entity.Priority
import com.anshmidt.taglist.model.repository.room.entity.Tag

@Database(
        entities = [
            Note::class, Priority::class, Tag::class, NoteTag::class
        ],
        version = 1
)
abstract class NotesDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
    abstract fun noteTagDao(): NoteTagDao
    abstract fun priorityDao(): PriorityDao
    abstract fun tagDao(): TagDao

    companion object {
        const val DATABASE_NAME = "notes"
    }
}