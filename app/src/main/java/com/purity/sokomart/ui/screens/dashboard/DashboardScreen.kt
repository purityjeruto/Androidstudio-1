package com.purity.sokomart.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.purity.sokomart.R
import com.purity.sokomart.navigation.ROUT_ABOUT
import com.purity.sokomart.navigation.ROUT_CONTACT
import com.purity.sokomart.navigation.ROUT_HOME
import com.purity.sokomart.navigation.ROUT_INTENT
import com.purity.sokomart.navigation.ROUT_ITEM
import com.purity.sokomart.ui.theme.newWhite

@Composable
fun DashboardScreen(navController: NavController) {
    Column (modifier = Modifier.fillMaxSize()) {

        //card
        Card(
            modifier = Modifier.fillMaxWidth().height(300.dp),
            shape = RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp),
            colors = CardDefaults.cardColors(Color.Magenta)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )

            {
                Image(
                    painter = painterResource(R.drawable.img_6),
                    contentDescription = "",
                    modifier = Modifier.size(150.dp),

                    )

                Text(
                    text = "Sokomart",
                    fontSize = 40.sp,
                    color = newWhite,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold
                )


            }

        }
        // end of card
        Spacer(modifier = Modifier.height(40.dp))
//row
        Row(modifier = Modifier.padding(start = 20.dp)) {
            //card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp).padding(15.dp).clickable{navController.navigate(
                    ROUT_HOME
                )},
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.Magenta)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_7),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp),

                        )
                    Text(text = "home", fontSize = 15.sp)
                }

            }

            // end of card


            Spacer(modifier = Modifier.height(40.dp))

            //card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp).padding(15.dp).clickable{navController.navigate(
                    ROUT_ABOUT
                )},
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.Magenta)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_8),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp),

                        )
                    Text(text = "about", fontSize = 15.sp)
                }

            }

            // end of card

        }

        Spacer(modifier = Modifier.height(40.dp))
        Row(modifier = Modifier.padding(start = 20.dp)) {
            //card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp).padding(15.dp).clickable{navController.navigate(
                    ROUT_CONTACT
                )},
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.Magenta)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_9),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp),

                        )
                    Text(text = "contact", fontSize = 15.sp)
                }

            }

            // end of card


            Spacer(modifier = Modifier.height(40.dp))

            //card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp).padding(20.dp).clickable{navController.navigate(
                    ROUT_ITEM
                )},
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.Magenta)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_10),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp),

                        )
                    Text(text = "products", fontSize = 15.sp)
                }

            }

            // end of card
        }


    }





}
@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(navController= rememberNavController())
}