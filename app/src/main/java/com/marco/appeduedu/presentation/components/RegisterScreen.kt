package com.marco.appeduedu.view.ui


import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.marco.appeduedu.presentation.Screen
import com.marco.appeduedu.presentation.components.ButtonComponent
import com.marco.appeduedu.presentation.theme.BlueMenu
import com.marco.appeduedu.presentation.theme.LightBlue


@Composable
fun RegisterScreen(navController: NavController) {
    BackgroundSection()
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column {
            LogoSection()
            WelcomeSection()
            LoginEditTextSection(30.dp)
            RegisterButtonsSection(navController)

        }

    }
}

@Composable
fun WelcomeSection(){
    Row(modifier = Modifier
        .padding(top = 30.dp)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
        ) {
        Text(
            text = "Seja bem-vindo,",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = LightBlue
        )

    }
    Row(modifier = Modifier
        .padding(top = 5.dp)
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {

        Text(
            text = "cadastre-se em nosso APP.",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = LightBlue
        )
    }

}

@Composable
fun RegisterButtonsSection(navController: NavController){
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
            text = "Registrar",
            backgroundColor = BlueMenu,
            textColor = Color.White,
            offset = 5.dp,
            paddingTop = 30.dp,
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
            paddingTop = 30.dp,
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