package com.purity.sokomart.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.purity.sokomart.R
import com.purity.sokomart.navigation.ROUT_ITEM

import com.purity.sokomart.ui.theme.newPurple

@Composable
fun StartScreen(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){




        Text(text = "welcome")

        Image(
            painter = painterResource(R.drawable.start),
            contentDescription = "start",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier =Modifier.height(20.dp))



        Text(text="find your order!!",
            fontSize=30.sp,
            fontWeight= FontWeight.Bold,
            color = newPurple
        )

        Spacer(modifier =Modifier.height(20.dp))


        Text(
            text="Fashionable breathable unisex sneakers available at wholesale price @999 · KES999 · NAIROBI.",
            fontSize=18.sp,
            textAlign = TextAlign.Center,
        )

        Button(
            onClick = {
                navController.navigate(ROUT_ITEM)
            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(newPurple),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp,end= 20.dp)
        )
        {
            Text(text="get started")
        }







    }







}





@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen(navController= rememberNavController())
}