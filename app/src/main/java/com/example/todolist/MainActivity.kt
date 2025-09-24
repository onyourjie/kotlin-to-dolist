package com.example.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.todolist.model.ToDoAppViewModel
import com.example.todolist.ui.ToDoApps
import com.example.todolist.ui.theme.TodoListTheme

class MainActivity : ComponentActivity() {
    private val viewModel: ToDoAppViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodoListTheme {
                ToDoApps(viewModel)
            }
        }
    }
}