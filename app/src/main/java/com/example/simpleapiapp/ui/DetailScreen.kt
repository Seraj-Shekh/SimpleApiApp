package com.example.simpleapiapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController, postId: String) {
    Scaffold(topBar = {
        TopAppBar(title = { Text("Post Details") })
    }) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            Text(text = "Post ID: $postId", style = MaterialTheme.typography.headlineMedium)
            Button(onClick = { navController.popBackStack() }) {
                Text("Go Back")
            }
        }
    }
}
