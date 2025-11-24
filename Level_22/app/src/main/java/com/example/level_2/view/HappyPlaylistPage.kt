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
import com.example.level_2.ui.theme.blueGradient

@Preview
@Composable
public fun HappyPlaylistPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(blueGradient)
            .padding(20.dp)
    ) {
        Text("Lagu Happy", fontSize = 25.sp, fontWeight = FontWeight.Bold)

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
                    "Happy",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Pharrel Williams",
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
                    "Good Time",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Owl City & Carly Rae Jepsen",
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
                    "Walking on Sunshine",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Katrina & The Waves",
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
                    "Best Day of My Life",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "American Authors",
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
                    "Sugar",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Maroon 5",
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
                    "Firework",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Katy Perry",
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
                    "Can't Stop the Feeling!",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Justin Timberlake",
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
                    "Shut Up and Dance",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "WALK THE MOON",
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
                    "On Top of the World",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Imagine Dragons",
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