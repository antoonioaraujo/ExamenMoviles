package com.example.comantoniojesusaraujoplataexamenej01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.comantoniojesusaraujoplataexamenej01.ui.theme.ComAntonioJesusAraujoPlataexamenEJ01Theme

//Crear una pantalla que muestre una lista de videojuegos, cada uno con una imagen,
//un nombre y un precio.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComAntonioJesusAraujoPlataexamenEJ01Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
//1. Define una data class con name, price y imageUrl.
data class Game(val name: String, val price: Double, val imageUrl: String)

//2. Usa LazyColumn para mostrar la lista de productos.
@Composable
fun GameList (name: String, price: Double, imageUrl: String) {
    LazyColumn {
        items(items = listOf(Game(name, price, imageUrl))) { game ->
            GameItem(game = game)
        }
    }
}
//3. Cada elemento de la lista debe mostrar una AsyncImage, un Text para el nombre de
//mayor tamaño y otro Text para el precio.

