package com.example.quizdesafio.screensPerguntas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quizdesafio.R

@Composable
fun MenuScreen (modifier: Modifier = Modifier, navController: NavController) {
    Box(modifier = modifier
        .fillMaxSize()
        .background(Color(0xFF82D9F7))
        .padding(20.dp),
        contentAlignment = Alignment.Center
    )
    {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            
            Row (modifier = Modifier
                .padding(bottom = 100.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.perguntas_frequentes),
                    contentDescription = "Imagem principal do Quiz",
                    modifier = Modifier
                        .size(100.dp),
                    contentScale = ContentScale.Crop,
                )
            }

            Column (modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "XENAI QUIZ",
                    fontWeight = Bold,
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier
                    .height(32.dp))

                Button(
                    modifier = Modifier
                        .width(225.dp),
                    onClick = {
                        navController.navigate("PrimeiraQuestionScreen")
                    },
                    colors = ButtonDefaults.buttonColors(Color(0xFFFFEB3B)),
                    border = BorderStroke(width = 1.dp, Color.Black)
                ) {
                    Text(
                        text = "COMEÇAR !",
                        color = Color.Black
                    )
                }
            }
        }
    }
}