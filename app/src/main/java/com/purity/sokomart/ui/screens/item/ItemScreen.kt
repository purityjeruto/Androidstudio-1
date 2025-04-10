package com.purity.sokomart.ui.screens.item

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.purity.sokomart.R
import com.purity.sokomart.navigation.ROUT_INTENT

import com.purity.sokomart.ui.theme.newPurple
import com.purity.sokomart.ui.theme.newWhite
import com.purity.sokomart.ui.theme.newBlue


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
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

        Column(modifier= Modifier.verticalScroll(rememberScrollState())){
            Image(
                painter = painterResource(
                    R.drawable.img_1
                ),
                contentDescription = "home",
                modifier=Modifier.fillMaxWidth().height(200.dp),
                contentScale = ContentScale.FillWidth
            )

            Spacer(modifier = Modifier.height(20.dp))
            //search bar
            var search by remember { mutableStateOf("") }
            OutlinedTextField(
                value = search,
                onValueChange = {search = it},
                modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                leadingIcon = {Icon(imageVector = Icons.Default.Search, contentDescription = "")},
                placeholder ={Text(text ="search..." )}
            )



            //end of searchbar
            Spacer(modifier = Modifier.height(10.dp))

            //row 1
            Row (modifier=Modifier.padding(start =20.dp)){
                Image(
                    painter = painterResource(
                        R.drawable.img_1
                    ),
                    contentDescription = "home",
                    modifier=Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth


                )
                Column (){
                    Text(
                        text = "Men's official shirts",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "Official wear",
                        fontSize = 20.sp
                    )
                    Text(
                        text = "Before:Ksh.2000",
                        fontSize = 20.sp,
                        textDecoration= TextDecoration.LineThrough
                    )
                    Text(
                        text = "Now : Ksh.1500",
                        fontSize = 20.sp
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newBlue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newBlue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newBlue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newBlue)


                    }


                }




            }

            //end of row 1

            //r0w2
            Row (modifier=Modifier.padding(start =20.dp)){
                Image(
                    painter = painterResource(
                        R.drawable.img_1
                    ),
                    contentDescription = "home",
                    modifier=Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth


                )
                Column (){
                    Text(
                        text = "Men's official shirts",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "Official wear",
                        fontSize = 20.sp
                    )
                    Text(
                        text = "Before:Ksh.2000",
                        fontSize = 20.sp,
                        textDecoration= TextDecoration.LineThrough
                    )
                    Text(
                        text = "Now : Ksh.1500",
                        fontSize = 20.sp
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newBlue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newBlue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newBlue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newBlue)


                    }


                }




            }
            Row (modifier=Modifier.padding(start =20.dp)){
                Image(
                    painter = painterResource(
                        R.drawable.img_1
                    ),
                    contentDescription = "home",
                    modifier=Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth


                )
                Column (){
                    Text(
                        text = "Men's official shirts",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "Official wear",
                        fontSize = 20.sp
                    )
                    Text(
                        text = "Before:Ksh.2000",
                        fontSize = 20.sp,
                        textDecoration= TextDecoration.LineThrough
                    )
                    Text(
                        text = "Now : Ksh.1500",
                        fontSize = 20.sp
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newBlue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newBlue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newBlue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newBlue)


                    }


                }




            }



        }








    }
}



@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(navController= rememberNavController())
}