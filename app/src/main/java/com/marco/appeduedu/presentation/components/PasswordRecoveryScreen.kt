package com.marco.appeduedu.view.ui


import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.marco.appeduedu.R
import com.marco.appeduedu.presentation.Screen
import com.marco.appeduedu.presentation.components.ButtonComponent
import com.marco.appeduedu.presentation.components.EditTextComponent
import com.marco.appeduedu.presentation.theme.BlueMenu
import com.marco.appeduedu.presentation.theme.LightBlue


@Composable
fun PasswordRecoveryScreen(navController: NavController) {
    BackgroundSection()
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column {
            LogoSection()
            RecoveryTextSection()
            PasswordRecoveryEditTextSection()
            RecoveryButtonsSection(navController)
        }
    }
}

@Composable
fun RecoveryTextSection(){
    Row(modifier = Modifier
        .padding(top = 30.dp,start = 40.dp)
        .fillMaxWidth()
        ) {
        Text(
            text = "Olá Aprendiz,",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = LightBlue
        )

    }
    Row(modifier = Modifier
        .padding(top = 5.dp,start = 40.dp, end = 40.dp)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {

        Text(
            text = "recupere sua senha digitando seu e-mail abaixo.",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = LightBlue
        )
    }

}

@Composable
fun RecoveryButtonsSection(navController: NavController){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(top = 40.dp)
            .fillMaxWidth()
    ) {
    }
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        ButtonComponent(
            text = "Registrar",
            backgroundColor = BlueMenu,
            textColor = Color.White,
            offset = 5.dp,
            paddingTop = 0.dp,
            paddingBottom = 0.dp,
            paddingStart = 80.dp,
            paddingEnd = 80.dp,
            onClick = {
                navController.navigate(Screen.HomeScreen.route)
            }
        )
        ButtonComponent(
            text = "Registrar",
            backgroundColor = Color.White,
            textColor = LightBlue,
            offset = 0.dp,
            paddingTop = 0.dp,
            paddingBottom = 0.dp,
            paddingStart = 80.dp,
            paddingEnd = 80.dp,
            onClick = {
                navController.navigate(Screen.HomeScreen.route)
            }
        )
    }
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        ButtonComponent(
            text = "Voltar",
            backgroundColor = BlueMenu,
            textColor = Color.White,
            offset = 5.dp,
            paddingTop = 20.dp,
            paddingBottom = 0.dp,
            paddingStart = 120.dp,
            paddingEnd = 120.dp,
            onClick = {
                navController.navigate(Screen.HomeScreen.route)
            }
        )
        ButtonComponent(
            text = "Voltar",
            backgroundColor = LightBlue,
            textColor = Color.White,
            offset = 0.dp,
            paddingTop = 20.dp,
            paddingBottom = 0.dp,
            paddingStart = 120.dp,
            paddingEnd = 120.dp,
            onClick = {
                navController.navigate(Screen.HomeScreen.route)
            }
        )
    }
}

@Composable
fun PasswordRecoveryEditTextSection(){
    EditTextComponent(label = "E-mail",
        icon = Icons.Filled.Email,
        painterResource(R.drawable.ic_visibility_on),1,30.dp,0.dp,31.dp, 30.dp)
}