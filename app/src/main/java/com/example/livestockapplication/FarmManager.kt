package com.example.livestockapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun farmManager() {

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
               Text("مدیریت مزرعه", modifier = Modifier.align(Alignment.Center),color = Color.White,fontSize = 25.sp)
               Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_back), contentDescription ="",

                   tint = Color.Unspecified)
           }
       }

        Card(modifier = Modifier.padding(top = 20.dp,start = 5.dp,end = 5.dp,bottom = 5.dp),shape = RoundedCornerShape(10.dp),backgroundColor = Color.Blue) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.22f),verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.Center) {
                Text(text = "ساخت کنسانتره",color = Color.White,fontSize = 30.sp,modifier = Modifier.padding(start = 50.dp,end = 20.dp))
                Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_background), contentDescription = "")


            }
        }
        Card(modifier = Modifier.padding(5.dp),shape = RoundedCornerShape(10.dp),backgroundColor = Color.Blue) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.30f),verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.Center) {
                Text(text = "ساخت خوراک",color = Color.White,fontSize = 30.sp,modifier = Modifier.padding(start = 65.dp,end = 20.dp))
                Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_background), contentDescription = "")


            }
        }
        Card(modifier = Modifier.padding(5.dp),shape = RoundedCornerShape(10.dp),backgroundColor = Color.Blue) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.43f),verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.Center) {
                Text(text = "خریداران",color = Color.White,fontSize = 30.sp,modifier = Modifier.padding(start = 120.dp,end = 20.dp))
                Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_background), contentDescription = "")

            }
        }
        Card(modifier = Modifier.padding(5.dp),shape = RoundedCornerShape(10.dp),backgroundColor = Color.Blue) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.85f),verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.Center) {
                Text(text = "ورود اطلاعات بهاروند",color = Color.White,fontSize = 30.sp,modifier = Modifier.padding(start = 0.dp,end = 10.dp))
                Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_background), contentDescription = "")

            }
        }
    }
}
