package com.example.myapplicationss

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun playactifity(
    modifier : Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) { SectionHeader()
        MainSection(judulparam = String, isiparam = String)
    }
}

@Composable
fun SectionHeader() {
    Box(modifier = Modifier.
    fillMaxWidth()
        .background(color = Color.LightGray)){
        Row(modifier = Modifier.padding(15.dp)){
            Box ( contentAlignment = Alignment.BottomEnd){
                Image(painter = painterResource(
                    id =R.drawable.judul) ,
                    contentDescription = "null", Modifier.size(100.dp))
                Icon(
                    Icons.Filled.Check,
                    contentDescription = "",
                    Modifier.padding(end = 13.dp)
                    )
            }
            Box(contentAlignment = Alignment.BottomEnd){
                Image(
                    painter = painterResource()
                )
            }
        }
    }
    Column(Modifier.padding(15.dp)) {
        Text(text = "Teknologi informasi",
            color = Color.White)
        Spacer(Modifier.padding(3.dp))
        Text(text =  "universitas",
            color = Color.White)
    }
}
@Composable
fun MainSection(judulparam : String, isiparam : String){
    Column(horizontalAlignment = Alignment.Start) {
        Text(text = "kepada yth :")
        Text(text = "jodi jodi")
        Spacer(modifier = Modifier.padding(20.dp))

        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = judulparam, modifier = Modifier )
            Text(text = "kels " , modifier = Modifier.weight(o.8f))
            Text(text = "$isiparam" , modifier = Modifier.weight(2f))
        }



    }
}
