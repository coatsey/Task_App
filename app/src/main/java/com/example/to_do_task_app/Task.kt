package com.example.to_do_task_app

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")
class Task(@PrimaryKey @ColumnInfo(name = "task")val task: String)