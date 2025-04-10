package com.purity.sokomart.ui.screens.assign

// MainActivity.kt
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.purity.sokomart.ui.theme.newNavy

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppUI()
        }
    }
}

@Composable
fun AppUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Top Section (Hi Samantha)
        TopSection()

        Spacer(modifier = Modifier.height(20.dp))

        // Projects Grid
        ProjectsGrid()

        Spacer(modifier = Modifier.height(20.dp))

        // Personal Tasks
        PersonalTasks()

        Spacer(modifier = Modifier.weight(1f))

        // Bottom Navigation
        BottomNavigation()
    }
}

@Composable
fun TopSection() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column {
            Text("Hi Samantha", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Text("Here are your projects", fontSize = 16.sp, color = Color.Gray)
        }
        // Placeholder for User Avatar (replace with actual image loading)
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Color.LightGray)
        )
    }
}

@Composable
fun ProjectsGrid() {
    Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
        ProjectCard(title = "Cryptocurrency Landing Page", taskCount = 12, color = Color(0xFF6200EE))
        ProjectCard(title = "Statistics Dashboard", taskCount = 8, color = Color(0xFFFF9800))
    }
}

@Composable
fun ProjectCard(title: String, taskCount: Int, color: Color) {
    Card(
        modifier = Modifier
            .width(150.dp)
            .height(120.dp),
        shape = RoundedCornerShape(8.dp),

    ) {
        Column(

        ) {
            Text(title, color = Color.White, fontWeight = FontWeight.Bold)
            Text("$taskCount Tasks", color = Color.White)
        }
    }
}

@Composable
fun PersonalTasks() {
    Column {
        Text("Personal Tasks", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        TaskItem(task = "NDA Review for website project", time = "10m")
        TaskItem(task = "Email Reply for Green Project", time = "10m")
    }
}

@Composable
fun TaskItem(task: String, time: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(task)
        Text("Today $time", color = Color.Gray)
    }
}

@Composable
fun BottomNavigation() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Home, contentDescription = "Home")
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Email, contentDescription = "Email")
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Home, contentDescription = "Home")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AppUI()
}

