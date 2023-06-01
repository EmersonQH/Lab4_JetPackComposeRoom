package com.example.lab4_jepckcomposejepckroom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4_jepckcomposejepckroom.ui.theme.Lab4_JepckComposeJepckRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4_JepckComposeJepckRoomTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),

                ) {
                    VentanaPrincipal()
                }
            }
        }
    }
}

@Composable
fun VentanaPrincipal() {
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var username = remember { mutableStateOf("") }
        var cursoMatricula = remember { mutableStateOf("") }

        Text(text = "Matricula", fontWeight = FontWeight.Bold, fontSize = 30.sp)

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = username.value,
            onValueChange = { username.value = it },
            label = { Text(text = "Nombre") },

            )

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = cursoMatricula.value,
            onValueChange = { cursoMatricula.value = it },
            label = { Text(text = "Curso") },

            )

        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { }) {
            Text("Incribirse al curso")
        }

        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { }) {
            Text(text = "Mostrar Usuarios matriculados")
        }

    }

}

@Preview(showBackground = true)
@Composable
fun Preview() {
    VentanaPrincipal()
}













