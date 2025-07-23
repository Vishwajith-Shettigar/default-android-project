package com.example.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class NoteEntity(
  @PrimaryKey(autoGenerate = true)
  val id: String,
  val title:String,
  val description:String
  )
