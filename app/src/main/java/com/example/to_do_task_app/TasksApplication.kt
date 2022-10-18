package com.example.to_do_task_app

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class TasksApplication : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { TaskRoomDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { TaskRepository(database.taskDao()) }
}