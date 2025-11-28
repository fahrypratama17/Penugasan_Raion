package com.example.aplikasi

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
import com.example.aplikasi.view.HomePageHappy
import com.example.aplikasi.view.HomePageSad
import com.example.aplikasi.view.LoginPage

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
                HomePageSad(navController, name)
            }
        }
    }
}