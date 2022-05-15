package com.example.todoapp_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.todoapp_final.database.TodoAssign;
import com.example.todoapp_final.todo.TodoFragment;
import com.example.todoapp_final.todo.UpdateFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TodoFragment.newInstance())
                    .commitNow();
        }
    }
    public void moveToUpdate(TodoAssign todo) {
        Bundle bundle=new Bundle();
        bundle.putSerializable("todo",todo);
        Fragment fragment= new UpdateFragment().newInstance();
        fragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment)
                .addToBackStack(null)
                .commit();
    }
}