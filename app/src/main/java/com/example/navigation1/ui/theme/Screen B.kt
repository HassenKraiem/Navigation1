package com.example.navigation1.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenB(myName:String,navController: NavController){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        Text(
            text = "This is screen B  $myName",
            fontSize = 50.sp,
            textAlign = TextAlign.Center,
            lineHeight = 50.sp,
            modifier = Modifier
                .clickable {navController.navigate(Routes.screenA){
                    popUpTo(Routes.screenA){
                        inclusive=true
                    }
                } }
        )
    }
}