package com.example.quizdesafio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.quizdesafio.correcaoPerguntas.Questions3
import com.example.quizdesafio.ui.theme.QuizDesafioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizDesafioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Questions3(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
