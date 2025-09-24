package com.example.todolist.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.todolist.model.ToDoAppViewModel
import com.example.todolist.ui.add.AddTaskScreen
import com.example.todolist.ui.detail.TaskDetailScreen
import com.example.todolist.ui.home.HomeScreen

@Composable
fun ToDoApps(
    viewModel: ToDoAppViewModel
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable(route = "home") {
            HomeScreen(navController = navController, viewModel = viewModel)
        }
        composable(route = "add") {
            AddTaskScreen(navController = navController, viewModel = viewModel)
        }
        composable(route = "detail/{taskId}") { backStackEntry ->
            val taskId = backStackEntry.arguments?.getString("taskId")
            TaskDetailScreen(navController = navController, viewModel = viewModel,
                taskId = taskId)
        }
    }

}