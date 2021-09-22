package com.marco.appeduedu.view.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.marco.appeduedu.R
import com.marco.appeduedu.presentation.Screen
import com.marco.appeduedu.presentation.components.ButtonComponent
import com.marco.appeduedu.presentation.components.EditTextComponent
import com.marco.appeduedu.presentation.theme.BlueMenu
import com.marco.appeduedu.presentation.theme.LightBlue
import com.marco.appeduedu.presentation.theme.Shapes


@Composable
fun HomeScreen(
    navController: NavController
) {
    BackgroundSection()
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column {
            LogoSection()
            LoginEditTextSection(57.35.dp)
            ButtonsSection(navController)
           CadastrarSection(navController)
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
fun LoginEditTextSection(paddingTop: Dp){
    EditTextComponent(label = "E-mail",
        icon = Icons.Filled.Email,painterResource(R.drawable.ic_visibility_on),1,paddingTop,0.dp,31.dp, 30.dp)
    EditTextComponent(label = "Senha",
        icon = Icons.Filled.Email,painterResource(R.drawable.ic_visibility_on),0,21.dp,0.dp,31.dp, 30.dp)
}




@Composable
fun ButtonsSection(navController: NavController){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
    ) {
    }
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        ButtonComponent(
            text = "Login",
            backgroundColor = BlueMenu,
            textColor = Color.White,
            offset = 5.dp,
            paddingTop = 36.58.dp,
            paddingBottom = 0.dp,
            onClick = {
                navController.navigate(Screen.SelectStudentScreen.route)
            }
        )
        ButtonComponent(
            text = "Login",
            backgroundColor = LightBlue,
            textColor = Color.White,
            offset = 0.dp,
            paddingTop = 36.58.dp,
            paddingBottom = 0.dp,
            onClick = {
                navController.navigate(Screen.SelectStudentScreen.route)
            }
        )
    }
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        ButtonComponent(
            text = "Esqueci senha",
            backgroundColor = BlueMenu,
            textColor = Color.White,
            offset = 5.dp,
            paddingTop = 21.dp,
            paddingBottom = 0.dp,
            onClick = {
                navController.navigate(Screen.RecoveryPasswordScreen.route)
            }
        )
        ButtonComponent(
            text = "Esqueci senha",
            backgroundColor = Color.White,
            textColor = LightBlue,
            offset = 0.dp,
            paddingTop = 21.dp,
            paddingBottom = 0.dp,
            onClick = {
                navController.navigate(Screen.RecoveryPasswordScreen.route)
            }
        )
    }


    }

@Composable
fun CadastrarSection(navController: NavController){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 25.dp)
    ) {
        ClickableText(
            text = AnnotatedString("Registre aqui", SpanStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = LightBlue
            )),
            onClick = {
                navController.navigate(Screen.RegisterScreen.route)
            }
        )

    }
}


