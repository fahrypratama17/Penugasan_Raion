package com.example.level_2.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.level_2.ui.theme.blueGradient
import com.example.level_2.ui.theme.yellowGradient
import androidx.compose.ui.graphics.Brush

@Composable
fun SongDetailPage(
    judul: String,
    penyanyi: String,
    deskripsi: String,
    type: String,
    navController: NavController
    ) {
    val bg = if (type == "happy") {
        Brush.verticalGradient(
            colors = listOf(
                Color(0xFFADD8E6),
                Color(0xFFF4FF66)
            )
        )
    } else {
        Brush.verticalGradient(
            colors = listOf(
                Color(0xFFADD8E6),
                Color(0xFF00008B)
            )
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(bg)
            .padding(20.dp)
    ) {
        Text("Detail Lagu", fontSize = 25.sp, fontWeight = FontWeight.Bold)

        Spacer(Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Column {
                Text(judul, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                Text(penyanyi, fontSize = 16.sp)
                Spacer(Modifier.height(15.dp))
                Text(deskripsi, fontSize = 14.sp)
            }
        }

        Spacer(Modifier.height(30.dp))

        Button(
            onClick = {
                if (type == "happy") {
                    navController.navigate("happyPlaylist")
                } else {
                    navController.navigate("sadPlaylist")
                }
            }
        ) {
            Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
            Spacer(Modifier.width(8.dp))
            Text("Kembali")
        }
    }
}
