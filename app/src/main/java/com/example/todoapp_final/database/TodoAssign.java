package com.example.todoapp_final.database;

import androidx.annotation.NonNull;
import java.io.Serializable;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "todo_table")
public class TodoAssign implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;
    @NonNull
    private  String title;
    private String description;
    private int priority;
    private String date;

    public TodoAssign(String title, String description, int priority, String date) { //, Date createdDate
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.date = date;
    }
    @Ignore
    public TodoAssign(int id, String title, String description, int priority) { //, Date createdDate, String date
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        //this.date = date;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
