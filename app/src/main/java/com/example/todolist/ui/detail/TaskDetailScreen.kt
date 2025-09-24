package com.example.todolist.ui.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.todolist.model.ToDoAppViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskDetailScreen (
    navController: NavController,
    viewModel: ToDoAppViewModel,
    taskId: String?
) {
    val task = viewModel.getTaskById(taskId)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = task?.title ?: "") },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    TextButton(onClick = {
                        viewModel.deleteTask(task?.id)
                        navController.popBackStack()
                    }) {
                        Text(text = "Delete")
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Text(
                text = task?.description ?: "",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(16.dp)
                    .padding(top = 16.dp)
                    .fillMaxSize()
            )
        }
    }
}

@Preview
@Composable
fun TaskDetailScreenPreview() {
    TaskDetailScreen(navController = rememberNavController(), viewModel = viewModel<ToDoAppViewModel>(), taskId = "2")
}