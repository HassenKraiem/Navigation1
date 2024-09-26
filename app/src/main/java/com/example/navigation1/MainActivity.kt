package com.example.navigation1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation1.ui.theme.Navigation1Theme
import com.example.navigation1.ui.theme.Routes
import com.example.navigation1.ui.theme.ScreenA
import com.example.navigation1.ui.theme.ScreenB

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Navigation1Theme {
                var navController= rememberNavController()
                NavHost(navController = navController, startDestination =Routes.screenA, builder = {
                    composable(route = Routes.screenA){
                        ScreenA(navController)
                    }
                    composable(route = Routes.screenB+"/{name}",
                        )
                    {
                        val name= it.arguments?.getString("name")
                        ScreenB(name?:"no name",navController)
                    }
                })

                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Navigation1Theme {

    }
}