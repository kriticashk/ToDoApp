package com.example.todoapp_final.todo;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.todoapp_final.database.TodoAssign;
import com.example.todoapp_final.database.TodoRepository;

import java.util.List;

public class TodoViewModel extends AndroidViewModel {
    private static TodoRepository mRepository;
    private LiveData<List<TodoAssign>> mTodos;

    public TodoViewModel(@NonNull Application application) {
        super(application);
        mRepository = new TodoRepository(application);
        mTodos = mRepository.getAllTask();
    }
    LiveData<List<TodoAssign>> getTodos() {
        return mTodos;
    }

    public void insert(TodoAssign todo) {
        mRepository.insert(todo);
    }
    public void update(TodoAssign todo) {
        mRepository.update(todo);
    }
    public static void delete(TodoAssign todo){
        mRepository.delete(todo);
    }

}
