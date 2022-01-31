package com.example.notesapp

import androidx.lifecycle.LiveData

class NoteRepository(private val notesDao: NotesDao) {

    // Получение заметок
    val allNotes: LiveData<List<Note>> = notesDao.getAllNotes()

    // Подстановка значений
    suspend fun insert(note: Note){
        notesDao.insert(note)
    }

    suspend fun delete(note: Note){
        notesDao.delete(note)
    }

    suspend fun update(note: Note){
        notesDao.update(note)
    }

}