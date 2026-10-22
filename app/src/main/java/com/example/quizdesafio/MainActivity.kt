package com.example.quizdesafio

import android.annotation.SuppressLint
import androidx.lifecycle.viewmodel.compose.viewModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quizdesafio.respostas.QuizViewModel
import com.example.quizdesafio.screensPerguntas.MenuScreen
import com.example.quizdesafio.screensPerguntas.PrimeiraQuestionScreen
import com.example.quizdesafio.screensPerguntas.SegundaQuestionScreen
import com.example.quizdesafio.screensPerguntas.StatusAvaliacaoScreen
import com.example.quizdesafio.screensPerguntas.TerceiraQuestionScreen
import com.example.quizdesafio.ui.theme.QuizDesafioTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("ViewModelConstructorInComposable")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizDesafioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "MenuScreen"
                    ) {
                        composable(route = "MenuScreen") {
                            MenuScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "PrimeiraQuestionScreen") {
                            PrimeiraQuestionScreen(modifier = Modifier.padding(innerPadding), navController, quizViewModel = QuizViewModel())
                        }
                        composable(route = "SegundaQuestionScreen") {
                            SegundaQuestionScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "TerceiraQuestionScreen") {
                            TerceiraQuestionScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "StatusAvaliacaoScreen") {
                            StatusAvaliacaoScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                    }
                }
            }
        }
    }
}
