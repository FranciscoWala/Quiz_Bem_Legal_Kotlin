package com.example.quizdesafio.correcaoPerguntas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizdesafio.R

@Composable
fun Questions3(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFEF98D0))
            .padding(20.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.perguntas_frequentes),
                contentDescription = "Imagem principal do Quiz",
                modifier = Modifier
                    .size(60.dp),
                contentScale = ContentScale.Crop,
            )

            Spacer(
                modifier = Modifier
                    .height(32.dp)
            )

            Row(
                modifier = Modifier
                    .width(200.dp)
                    .height(40.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .border(
                        width = 1.dp, color = Color.Black,
                        shape = RoundedCornerShape(
                            size = 10.dp
                        )
                    )
                    .background(color = Color(0xFF66CC6D)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Pergunta 3 de 3",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp
                )
            }

            Spacer(
                modifier = Modifier
                    .height(32.dp)
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(Color.White),
                elevation = CardDefaults.cardElevation(4.dp),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.Start
                    ) {

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "Qual a ligação presente na célula H2O?",
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 20.sp
                            )
                        }

                        Button(
                            modifier = Modifier
                                .fillMaxWidth(),
                            onClick = {},
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(width = 1.dp, Color.Gray),
                            colors = ButtonDefaults.buttonColors(Color.Transparent)

                        ) {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                text = "Iônica",
                                textAlign = TextAlign.Left,
                                color = Color.Black
                            )
                        }

                        Button(
                            modifier = Modifier
                                .fillMaxWidth(),
                            onClick = {},
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(width = 1.dp, Color.Gray),
                            colors = ButtonDefaults.buttonColors(Color.Transparent)
                        ) {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                text = "Covalente",
                                textAlign = TextAlign.Left,
                                color = Color.Black
                            )
                        }
                        Button(
                            modifier = Modifier
                                .fillMaxWidth(),
                            onClick = {},
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(width = 1.dp, Color.Gray),
                            colors = ButtonDefaults.buttonColors(Color.Transparent)
                        ) {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                text = "Metálica",
                                textAlign = TextAlign.Left,
                                color = Color.Black
                            )
                        }
                        Button(
                            modifier = Modifier
                                .fillMaxWidth(),
                            onClick = {},
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(width = 1.dp, Color.Gray),
                            colors = ButtonDefaults.buttonColors(Color.Transparent)
                        ) {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                text = "Amorosa",
                                textAlign = TextAlign.Left,
                                color = Color.Black
                            )
                        }

                    }
                }
            }
        }
    }
}
