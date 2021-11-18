package com.example.livestockapplication

import androidx.annotation.ColorRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Home(){
    
    Column() {
        Card(modifier = Modifier.padding(10.dp),shape = RoundedCornerShape(10.dp),backgroundColor = Color.Blue) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.30f),verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.Center) {
                Text(text = "مدیریت مزرعه",color = Color.White,fontSize = 30.sp,modifier = Modifier.padding(start = 50.dp,end = 20.dp))
                Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_background), contentDescription ="" )
            }
        }
        Card(modifier = Modifier.padding(10.dp),shape =  RoundedCornerShape(10.dp),backgroundColor = Color.Blue) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.50f),verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.Center) {
                Text(text = "گزارش", color = Color.White,fontSize = 30.sp,modifier = Modifier.padding(start = 110.dp,end = 50.dp))
                Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_background), contentDescription ="" )
            }
        }
        
        Row(verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.Center) {
            Card(modifier = Modifier.padding(10.dp),shape = RoundedCornerShape(10.dp),backgroundColor = Color.Blue) {
                Column(modifier = Modifier.fillMaxWidth(0.48f).fillMaxHeight(),verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_background), contentDescription ="", )
                    Text(text = "پروفایل", color = Color.White,fontSize = 30.sp,modifier = Modifier.padding(top = 10.dp,start = 50.dp,end = 20.dp))

                }
            }
            Card(modifier = Modifier.padding(10.dp),shape = RoundedCornerShape(10.dp),backgroundColor = Color.Blue) {
                Column(modifier = Modifier.fillMaxWidth(1f).fillMaxHeight(),verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_background), contentDescription ="", )
                    Text(text = "پشتیبان", color = Color.White,fontSize = 30.sp,modifier = Modifier.padding(top = 10.dp,start = 50.dp,end = 20.dp).fillMaxWidth(),textAlign = TextAlign.Center)

                }
            }
        }
    }
}