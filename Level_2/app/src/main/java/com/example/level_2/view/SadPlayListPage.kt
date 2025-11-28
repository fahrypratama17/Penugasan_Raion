package com.example.level_2.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import com.example.level_2.model.SadPlaylistSong
import com.example.level_2.ui.theme.blueGradient

//@Preview
@Composable
fun SadPlaylistPage(
    navController: NavController,
    name: String
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(blueGradient)
            .verticalScroll(scrollState)
            .padding(20.dp)
    ) {
        Text("Lagu Sad", fontSize = 25.sp, fontWeight = FontWeight.Bold)

        Spacer(Modifier.height(20.dp))

        SadPlaylistSong.sadSongs.forEach { lagu ->
            SadSong(lagu)
            Spacer(Modifier.height(20.dp))
        }

        Button(
            onClick = {navController.navigate("sadPage/$name")},
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