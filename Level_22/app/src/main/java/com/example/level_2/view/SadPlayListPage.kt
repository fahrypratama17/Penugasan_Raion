package com.example.level_2.view

import android.widget.Space
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.level_2.ui.theme.Purple40

@Preview
@Composable
public fun SadPlaylistPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Purple40)
            .padding(20.dp)
    ) {
        Text("Lagu Sad", fontSize = 25.sp, fontWeight = FontWeight.Bold)

        Spacer(Modifier.height(20.dp))

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
                    "Fix You",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Coldplay",
                    fontSize = 14.sp,
                )
            }
        }

        Spacer(Modifier.height(20.dp))

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
                    "All I Want",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Kodaline",
                    fontSize = 14.sp,
                )
            }
        }

        Spacer(Modifier.height(20.dp))

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
                    "Someone Like You",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Adele",
                    fontSize = 14.sp,
                )
            }
        }

        Spacer(Modifier.height(20.dp))

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
                    "Say Something",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "A Great Big World & Christina Aguilera",
                    fontSize = 14.sp,
                )
            }
        }

        Spacer(Modifier.height(20.dp))

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
                    "When I Was Your Man",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Bruno Mars",
                    fontSize = 14.sp,
                )
            }
        }

        Spacer(Modifier.height(20.dp))

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
                    "Let Her Go",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Passenger",
                    fontSize = 14.sp,
                )
            }
        }

        Spacer(Modifier.height(20.dp))

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
                    "The Night We Met",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Lord Huron",
                    fontSize = 14.sp,
                )
            }
        }

        Spacer(Modifier.height(20.dp))

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
                    "Love of My Life",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Queen",
                    fontSize = 14.sp,
                )
            }
        }

        Spacer(Modifier.height(20.dp))

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
                    "Happier",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Ed Sheeran",
                    fontSize = 14.sp,
                )
            }
        }

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = {},
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