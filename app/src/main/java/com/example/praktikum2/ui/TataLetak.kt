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

@Composable
fun TataletakColumnRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(8.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("Baris1-Komponen1")
            Text("Baris1-Komponen2")
            Text("Baris1-Komponen3")
        }

        Spacer(Modifier.height(10.dp)) // Initial Spacer height

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("Baris2-Komponen1")
            Text("Baris2-Komponen2")
            Text("Baris2-Komponen3")
        }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Kolom1-Komponen1")
            Text("Kolom1-Komponen2")
            Text("Kolom1-Komponen3")
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Kolom2-Komponen1")
            Text("Kolom2-Komponen2")
            Text("Kolom2-Komponen3")
        }
    }
}

@Composable
fun TataLetakBoxColumnRow(modifier: Modifier = Modifier) { // Fungsi utama yang dipanggil di MainActivity
    // Asumsi: R.drawable.musik sudah tersedia di folder res/drawable/
    val gambar = painterResource(id = R.drawable.musik)

    // Layout utama — seluruh konten di tengah layar
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White), // Initial background
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(300.dp) // area gambar + teks
                .background(Color.Transparent),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = "Gambar Musik",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(170.dp) // Initial image size
            )

            Text(
                text = "My Music",
                fontSize = 80.sp, // Initial font size
                color = Color(0xFF008080), // Initial color (Teal)
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}