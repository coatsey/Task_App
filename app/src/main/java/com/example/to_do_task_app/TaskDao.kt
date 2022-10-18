package com.example.to_do_task_app

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    @Query("SELECT * FROM task_table ORDER BY task ASC")
    fun getAlphabetizedTasks(): Flow<List<Task>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(task: Task)

    @Query("DELETE FROM task_table")
    fun deleteAll()

}