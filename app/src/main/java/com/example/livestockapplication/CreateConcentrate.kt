package com.example.livestockapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun createConcentrate() {

    Column(modifier = Modifier.fillMaxSize()) {
        Row() {
            Box(

                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(Color.Blue)
                    .clip(shape = RoundedCornerShape(20.dp)),

                )
            {
                Text("ساخت کنسانتره", modifier = Modifier.align(Alignment.Center),color = Color.White,fontSize = 25.sp)
                Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_back), contentDescription ="",

                    tint = Color.Unspecified)
            }
        }

        Card(modifier = Modifier.padding(top = 20.dp,start = 5.dp,end = 5.dp,bottom = 5.dp),shape = RoundedCornerShape(10.dp),backgroundColor = Color.Blue) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.28f),verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.Center) {
                Text(text = "ثبت کنسانتره",color = Color.White,fontSize = 30.sp,modifier = Modifier.padding(start = 70.dp,end = 20.dp))
                Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_background), contentDescription = "")

            }
        }
        Card(modifier = Modifier.padding(5.dp),shape = RoundedCornerShape(10.dp),backgroundColor = Color.Blue) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.40f),verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.Center) {
                Text(text = "آرشیو کنسانتره",color = Color.White,fontSize = 30.sp,modifier = Modifier.padding(start = 50.dp,end = 20.dp))
                Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_background), contentDescription = "")


            }
        }
    }
}
