package com.marco.appeduedu.ui


import android.util.LayoutDirection.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.marco.appeduedu.R
import com.marco.appeduedu.ui.theme.LightBlue



@Composable
fun HomeScreen() {
    BackgroundSection()
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column {
            LogoSection()
            LoginEditTextSection()
            ButtonsSection()
        }

    }
}

@Composable
fun BackgroundSection(){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Image(painter = painterResource(id = R.drawable.bg_login),
            contentDescription = null,
            modifier = Modifier.fillMaxSize())

    }
}


//LogoSection
@Composable
fun LogoSection() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 54.dp),
        horizontalArrangement = Arrangement.Center
    ) {

        Box(
            contentAlignment = Alignment.Center


        ) {
            Image(painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier.size(179.dp,93.dp)
            )
        }

    }
}

@Composable
fun LoginEditTextSection(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 57.35.dp)
    ) {

        val textState = remember { mutableStateOf(TextFieldValue()) }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 31.dp, end = 30.dp)
                .height(55.dp),
            value = textState.value,
            label = {Text("E-mail",color = LightBlue,fontWeight = FontWeight.Bold)},
            onValueChange = { textState.value = it },
            placeholder = {
                Text(text = "")
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = LightBlue,
                unfocusedBorderColor = LightBlue
            ),
            trailingIcon = {
                Icon(Icons.Filled.Email, "", tint = LightBlue)
            },
            singleLine = true
        )


    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 31.dp),
        horizontalArrangement = Arrangement.Center
    ) {

        val textState = remember { mutableStateOf(TextFieldValue()) }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 31.dp, end = 30.dp)
                .height(55.dp),
            value = textState.value,
            label = {
                Text("Senha",color = LightBlue,fontWeight = FontWeight.Bold)},
            onValueChange = { textState.value = it },
            placeholder = {
                Text(text = "")
            }
        ,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = LightBlue,
                unfocusedBorderColor = LightBlue
            ),
            trailingIcon = {
                Icon(painter = painterResource(R.drawable.ic_visibility_on), "", tint = LightBlue)
            },
            singleLine = true
        )
    }
    
}


@Composable
fun ButtonsSection(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 36.58.dp),
            contentAlignment = Alignment.Center) {

            Image(painter = painterResource(id = R.drawable.btn_login),
                contentDescription = null,
                Modifier.clickable {  }
                    .size(300.dp,55.dp),
                alignment = Alignment.Center

            )

    }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 21.dp),
            contentAlignment = Alignment.Center) {

            Image(painter = painterResource(id = R.drawable.btn_esqueci_senha),
                contentDescription = null,
                Modifier.clickable {  }
                    .size(300.dp,50.dp),
                alignment = Alignment.Center
            )


/*
            val shapeButton = object : Shape{
                override fun createOutline(
                    size: Size,
                    layoutDirection: LayoutDirection,
                    density: Density
                ): Outline {
                    val p1 = Path().apply {
                        //addOval(Rect(0f, 0f, size.width + 1, size.height + 1))
                    }
                    return Outline.Generic(p1)
                }

            }
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = LightBlue),
                shape = shapeButton,
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 31.dp, end = 30.dp)
                    .height(50.dp)

            ) {
                Text(text = "Login",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
*/
        }
    }
}
