package com.example.comenu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.comenu.ui.theme.CoMenuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoMenuTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CardComenu("Android")
                }
            }
        }
    }
}
@Composable
fun CardComenu (name: String) {
    Card(modifier = Modifier
        .wrapContentSize()
        , elevation = 20.dp) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
            .background(Color.Gray)) {
            Image(painter = painterResource(id = R.drawable.imagen), contentDescription = null, modifier = Modifier
                .size(110.dp)
                .padding(15.dp)
                .clip(shape = RoundedCornerShape(8.dp)))
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Nombre del Restaurante", fontWeight = FontWeight.Bold, fontSize =18.sp, modifier = Modifier.padding(top=15.dp))
                Text(text = "Categoría de Comida", fontSize = 15.sp)
                Text(text = "Categoría de Comida", fontSize = 15.sp)
                Text(text = "Dirección del local", fontSize = 15.sp)
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp), horizontalArrangement = Arrangement.End) {
                       Text(text="abierto", fontSize = 16.sp)
                        Image(painter = painterResource(id = R.drawable.ellipse_48), contentDescription = null,
                            modifier = Modifier.size(5.dp))
                      Row(modifier = Modifier
                          .fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                          Image(painter = painterResource(id = R.drawable.group_10239,
                          ), contentDescription = null, modifier = Modifier
                              .size(40.dp)
                              .padding(end = 2.dp))
                      }
                      }
                   }

                    }
                }
            }




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoMenuTheme {
            CardComenu("Android")
    }
}