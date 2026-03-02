package com.example.praktam_2457051007

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.praktam_2457051007.model.FocusSessionSource
import com.example.praktam_2457051007.ui.theme.PrakTAM_2457051007Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakTAM_2457051007Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val sessions = FocusSessionSource.sessions

    Column(
        modifier = modifier.padding(16.dp)
    ) {
        sessions.forEach { session ->
            Text(text = "Hari: ${session.hari}")
            Text(text = "Durasi: ${session.durasi} menit")
            Text(text = "Status: ${session.status}")
            Text(text = "------------------")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrakTAM_2457051007Theme {
        Greeting()
    }
}