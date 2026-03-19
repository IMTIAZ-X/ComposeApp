package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import com.example.compose.ui.theme.ComposeApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApp {
                myapp()
            }
        }
    }
}

@Composable
fun myapp(){
    Text(
        text = "Hello World",
        fontSize = 18.sp
    )
}