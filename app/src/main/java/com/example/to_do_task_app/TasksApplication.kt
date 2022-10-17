package com.example.to_do_task_app

import android.app.Application

class TasksApplication : Application() {

    val database by lazy { TaskRoomDatabase.getDatabase(this) }
    val repository by lazy { TaskRepository(database.taskDao()) }
}