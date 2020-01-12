package com.anshmidt.taglist.model.repository.room.entity

import androidx.room.*
import com.anshmidt.taglist.model.repository.room.DateConverter
import java.util.*

@Entity(
        tableName = Note.TABLE_NAME,
        foreignKeys = [
            ForeignKey(
                    entity = Priority::class,
                    parentColumns = [Priority.KEY_ID],
                    childColumns = [Note.KEY_PRIORITY_ID],
                    onDelete = ForeignKey.CASCADE
            )
        ]
)
@TypeConverters(DateConverter::class)
data class Note(
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = KEY_ID)
        var id: Int,

        @ColumnInfo(name = KEY_DATE)
        var date: Date,

        @ColumnInfo(name = KEY_PRIORITY_ID)
        var priorityId: Int,

        @ColumnInfo(name = KEY_TEXT)
        var text: String

) {
    companion object {
        const val TABLE_NAME = "notes"
        const val KEY_ID = "id"
        const val KEY_DATE = "date"
        const val KEY_PRIORITY_ID = "priority_id"
        const val KEY_TEXT = "text"
    }
}