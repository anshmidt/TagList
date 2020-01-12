package com.anshmidt.taglist.dagger

import android.app.Application
import androidx.room.Room
import com.anshmidt.taglist.model.repository.room.NotesDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun providesDatabase(app: Application): NotesDatabase {
        return Room.databaseBuilder(app, NotesDatabase::class.java, NotesDatabase.DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .build()
    }



}