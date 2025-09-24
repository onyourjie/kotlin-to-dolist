package com.example.todolist.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todolist.model.ToDoAppViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen (
    viewModel : ToDoAppViewModel
){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Home") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ }
            ){
               Icon(
                   imageVector = Icons.Default.Add,
                   contentDescription = "Add Task"
               )
            }
        }
    ){
        innerPadding ->
        LazyColumn(modifier = Modifier.padding(innerPadding)) {
                items(viewModel.tasks) { task ->
                    Card (
                        modifier = Modifier.padding(8.dp)
                            .clickable{
                                //TODO: Navigate to task details
                            }
                    ){
                        Text(text = task.title,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.padding(16.dp))
                    }
                }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(viewModel = ToDoAppViewModel())
}