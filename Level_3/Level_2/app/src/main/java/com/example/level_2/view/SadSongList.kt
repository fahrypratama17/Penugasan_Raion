package com.example.level_2.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.level_2.model.Lagu

@Composable
fun SadSong(song : Lagu) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .fillMaxWidth()
            .height(60.dp)
            .padding(10.dp)

    ) {
        Column {
            Text(
                song.judul,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                song.penyanyi,
                fontSize = 14.sp,
            )
        }
    }
}