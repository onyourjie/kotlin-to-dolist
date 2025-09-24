package com.example.todolist.model

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class ToDoAppViewModel: ViewModel() {
    private val _tasks = mutableStateListOf(
        Task("1", "Task 1"),
        Task("2", "Task 2", "Sweep the floor"),
        Task("3", "Task 3", "Clean the car"),
    )
    val tasks: List<Task> get() = _tasks

    fun addTask(task: Task) {
        _tasks.add(task)
    }

    fun deleteTask(taskId: String?) {
        _tasks.removeAll { it.id == taskId }
    }

    fun getTaskById(taskId: String?): Task? {
        return _tasks.find { it.id == taskId }
    }


}