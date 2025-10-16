package com.example.praktikum2 // PASTIKAN package ini sama dengan MainActivity.kt

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum2.R // Import R class (resources)

@Composable
fun TataletakColumn(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.padding(16.dp)
    ) {
        // Menerapkan warna Navy Blue (0xFF000080)
        Text("Komponen1", color = Color(0xFF000080))
        Text("Komponen2", color = Color(0xFF000080))
        Text("Komponen3", color = Color(0xFF000080))
        Text("Komponen4", color = Color(0xFF000080))
    }
}

@Composable
fun TataletakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp), // Initial padding
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text("Komponen1")
        Text("Komponen2")
        Text("Komponen3")
        Text("Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.LightGray), // Initial background
        contentAlignment = Alignment.Center
    ) {
        Text("Ini di dalam Box", fontWeight = FontWeight.Bold)
    }
}