package com.purity.sokomart.ui.screens.form

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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.purity.sokomart.R
import com.purity.sokomart.navigation.ROUT_ITEM
import com.purity.sokomart.ui.theme.newGreen
import com.purity.sokomart.ui.theme.newPurple

@Composable
fun FormScreen(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize()   .paint(painter = painterResource(R.drawable.img_13), contentScale =  ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,


    ){

        Image(
            painter = painterResource(R.drawable.img_15),
            contentDescription = "start",
            modifier = Modifier
                .size(200.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "CREATE AN ACCOUNT",
            fontSize = 30.sp
        )
        Spacer(modifier =Modifier.height(20.dp))


        //variables.

        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }



        //fullname
        OutlinedTextField(
            value = fullname,
            onValueChange = { fullname =it },
            modifier = Modifier.fillMaxWidth().padding(start =20.dp,end=20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "",tint=Color.Magenta) },
            label = { Text(text = "Fullname")},
            colors= OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Magenta,
                unfocusedBorderColor = Color.Black


            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //End
        Spacer(modifier =Modifier.height(20.dp))
        //username
        OutlinedTextField(
            value = username,
            onValueChange = { username =it },
            modifier = Modifier.fillMaxWidth().padding(start =20.dp,end=20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "",tint=Color.Magenta) },
            label = { Text(text = "Username")},
            colors= OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Magenta,
                unfocusedBorderColor = Color.Black


            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //End
        Spacer(modifier =Modifier.height(20.dp))
        //email
        OutlinedTextField(
            value = email,
            onValueChange = { email =it },
            modifier = Modifier.fillMaxWidth().padding(start =20.dp,end=20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "",tint=Color.Magenta) },
            label = { Text(text = "email")},
            colors= OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Magenta,
                unfocusedBorderColor = Color.Black


            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        //End
        Spacer(modifier =Modifier.height(20.dp))
        //password
        OutlinedTextField(
            value = password,
            onValueChange = { password =it },
            modifier = Modifier.fillMaxWidth().padding(start =20.dp,end=20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "",tint=Color.Magenta) },
            label = { Text(text = "Password")},
            colors= OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Magenta,
                unfocusedBorderColor = Color.Black


            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
        //End

        Spacer(modifier =Modifier.height(20.dp))
            Button(
                onClick = {},
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
fun FormScreenPreview(){
    FormScreen(navController= rememberNavController())
}