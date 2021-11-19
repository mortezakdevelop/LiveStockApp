package com.example.livestockapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment

class FarmManagerFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {

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

            }
        }
    }
}