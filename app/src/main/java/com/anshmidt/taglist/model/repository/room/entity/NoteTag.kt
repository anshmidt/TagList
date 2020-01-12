package com.anshmidt.taglist.model.repository.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
        tableName = NoteTag.TABLE_NAME,
        primaryKeys = [NoteTag.KEY_TAG_ID, NoteTag.KEY_NOTE_ID],
        foreignKeys = [
            ForeignKey(
                    entity = Note::class,
                    parentColumns = [Note.KEY_ID],
                    childColumns = [NoteTag.KEY_NOTE_ID],
                    onDelete = ForeignKey.CASCADE
            ),
            ForeignKey(
                    entity = Tag::class,
                    parentColumns = [Tag.KEY_ID],
                    childColumns = [NoteTag.KEY_TAG_ID],
                    onDelete = ForeignKey.CASCADE
            )
        ]
)
data class NoteTag(
    @ColumnInfo(name = KEY_NOTE_ID)
    var noteId: Int,

    @ColumnInfo(name = KEY_TAG_ID)
    var tagId: Int
) {
    companion object {
        const val TABLE_NAME = "note_tags"
        const val KEY_NOTE_ID = "note_id"
        const val KEY_TAG_ID = "tag_id"
    }
}