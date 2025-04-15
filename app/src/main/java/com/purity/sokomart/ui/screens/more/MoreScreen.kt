package com.purity.sokomart.ui.screens.more

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.purity.sokomart.R
import com.purity.sokomart.navigation.ROUT_INTENT
import com.purity.sokomart.navigation.ROUT_ITEM
import com.purity.sokomart.navigation.ROUT_MORE
import com.purity.sokomart.ui.theme.newPurple
import com.purity.sokomart.ui.theme.newWhite
import java.nio.file.WatchEvent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavController) {
    val mContext= LocalContext.current
    Column (modifier = Modifier.fillMaxSize()){
        //top appbar

        TopAppBar(
            title = { Text(text ="item") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = newPurple,
                titleContentColor = newWhite,
                navigationIconContentColor = newWhite,
                actionIconContentColor = newWhite
            ),

            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                }
            },
            actions={
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                }

                IconButton(onClick = {}) {

                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
                }
                IconButton(onClick = {
                    navController.navigate(ROUT_INTENT)
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }
            }



        )
        //end of topappbar

        Spacer(modifier = Modifier.height(20.dp))

        //search bar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = {Icon(imageVector = Icons.Default.Search, contentDescription = "")},
            placeholder ={Text(text ="search more products..." )}
        )

        //end of searchbar

        Spacer(modifier = Modifier.height(10.dp))

        //box
        Box(
            modifier = Modifier.fillMaxWidth().height(250.dp),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(R.drawable.img_3),
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillWidth
            )
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "",
                tint=newWhite,
                modifier = Modifier.align(alignment=Alignment.TopEnd).padding(10.dp)
            )
            Text(
                text = "find the best products",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,

            )
        }

        //end of box
        Spacer(modifier = Modifier.height(10.dp))




































































































        Text(
            text = "Popular types of smart watches",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))

        //row
        Row (
            modifier = Modifier.padding(start = 20.dp).horizontalScroll(rememberScrollState())
        ) {
            //column
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.img_4),
                    contentDescription = "",
                    modifier = Modifier.size(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillBounds
                )
                Text(
                    text = "Oraimo smart watch",
                    fontSize = 15.sp
                )
                Text(
                    text = "20000",
                    fontSize = 15.sp
                )
                Button(
                    onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }


                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Color.Magenta)
                )
                {
                    Text(text = "pay")
                }


            }
        }

            //end of column

        Spacer(modifier = Modifier.height(10.dp))








        // end of row
}

























}






@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(navController= rememberNavController())
}