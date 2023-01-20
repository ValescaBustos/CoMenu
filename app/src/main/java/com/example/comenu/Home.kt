package com.example.comenu

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp


data class menuVisitas(
    val img:Int, val descripcion:String)



val listaComidas =listOf(
    menuVisitas(R.drawable.sushi,"Sushi"),
    menuVisitas(R.drawable.pizza,"Pizza"),
    menuVisitas(R.drawable.hamburguesa,"Hamburguesa"),
    menuVisitas(R.drawable.cafeter_a,"Cafetería")
)

@Composable
fun MenuVisitas() {
    LazyRow(){
      items(listaComidas){tipoComidas->
          Card(modifier = Modifier.width(120.dp).padding(10.dp).height(120.dp).background(color= Color(0xBB86FC))) {
            Image(painter = painterResource(id = tipoComidas.img), contentDescription ="", modifier = Modifier.size(100.dp).background(color = Color(0xBB86FC)) )
          }

      }
    }
}
