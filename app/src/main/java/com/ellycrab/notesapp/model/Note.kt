package com.ellycrab.notesapp.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "notes")
@Parcelize // activity<=>fragment간 데이터 읽기쉽게 만들어줌
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val noteTitle:String,
    val noteDesc:String
):Parcelable
