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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen (

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
                items(emptyList<String>()) { item ->
                    Card (
                        modifier = Modifier.padding(8.dp)
                            .clickable{
                                //TODO: Navigate to task details
                            }
                    ){
                        Text(text = "hello")
                    }
                }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}