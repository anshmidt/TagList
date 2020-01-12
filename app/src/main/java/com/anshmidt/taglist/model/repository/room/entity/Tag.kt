package com.anshmidt.taglist.model.repository.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = Tag.TABLE_NAME)
data class Tag(
        @PrimaryKey
        @ColumnInfo(name = KEY_ID)
        var id: Int,

        @ColumnInfo(name = KEY_NAME)
        var name: String

) {
    companion object {
        const val TABLE_NAME = "tags"
        const val KEY_ID = "id"
        const val KEY_NAME = "name"
    }
}