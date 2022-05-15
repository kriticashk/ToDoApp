package com.example.todoapp_final.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TodoDao {

    @Query("Select * from todo_table order by priority")
    public LiveData<List<TodoAssign>> getAllTasks();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insert(TodoAssign todo);

    @Query("delete from todo_table")
    void deleteAll();

    @Delete
    public void  delete(TodoAssign todo);

    @Update
    void  update(TodoAssign todo);
}
