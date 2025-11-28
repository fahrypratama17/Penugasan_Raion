package com.example.aplikasi

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.isImeVisible
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onVisibilityChanged
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.aplikasi.ui.theme.neutralGradient

//@Preview
@Composable
public fun HomePage(
    navController: NavController,
    name: String
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(neutralGradient),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Selamat Datang", fontSize = 40.sp, fontWeight = FontWeight.Bold)
        Text(name, fontSize = 40.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray)

        Spacer(Modifier.height(50.dp))

        Button(
            onClick = {
                navController.navigate("happyPage/$name")
            },
            modifier = Modifier
                .width(300.dp)
                .height(40.dp)
        ) {
            Text(
                "\uD83D\uDE04 Aku Happy"
            )
        }

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = {
                navController.navigate("sadPage/$name")
            },
            modifier = Modifier
                .width(300.dp)
                .height(40.dp)
        ) {
            Text(
                "\uD83D\uDE22 Aku Sad"
            )

        }
    }
}