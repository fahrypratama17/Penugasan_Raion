package com.example.level_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.level_2.ui.theme.Level_2Theme
import com.example.level_2.view.HappyPlaylistPage
import com.example.level_2.view.HomePage
import com.example.level_2.view.HomePageHappy
import com.example.level_2.view.HomePageSad
import com.example.level_2.view.LoginPage
import com.example.level_2.view.SadPlaylistPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            navigation(navController = rememberNavController())
        }
    }

    @Composable
    fun navigation(navController: NavHostController) {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "LoginPage") {
            composable("LoginPage") { LoginPage(navController) }

            composable("HomePage/{name}") { backStackEntry ->
                val name = backStackEntry.arguments?.getString("name") ?: ""
                HomePage(navController, name) }

            composable("happyPage/{name}") { backStackEntry ->
                val name = backStackEntry.arguments?.getString("name") ?: ""
                HomePageHappy(navController, name) }

            composable("sadPage/{name}") { backStackEntry ->
                val name = backStackEntry.arguments?.getString("name") ?: ""
                HomePageSad(navController, name) }

            composable("happyPlaylist") { HappyPlaylistPage(navController) }
            composable("sadPlaylist") { SadPlaylistPage(navController) }
        }
    }
}