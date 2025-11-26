package com.example.level_2.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.level_2.model.HappyPlaylistSong
import com.example.level_2.ui.theme.blueGradient
import com.example.level_2.ui.theme.yellowGradient

//@Preview
@Composable
fun HappyPlaylistPage(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(yellowGradient)
            .padding(20.dp)
    ) {
        Text("Lagu Happy", fontSize = 25.sp, fontWeight = FontWeight.Bold)

        Spacer(Modifier.height(20.dp))

        HappyPlaylistSong.happySongs.forEach { lagu ->
            HappySong(lagu)
            Spacer(Modifier.height(20.dp))
        }

        Button(
            onClick = {navController.navigate("HomePage")},
            modifier = Modifier
                .fillMaxSize()
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Back"
            )
            Spacer(Modifier.width(10.dp))
            Text("Kembali")
        }
    }
}