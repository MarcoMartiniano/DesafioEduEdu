package com.marco.appeduedu.presentation.components


import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.marco.appeduedu.presentation.theme.BlueMenu
import com.marco.appeduedu.presentation.theme.LightBlue
import com.marco.appeduedu.presentation.theme.Shapes



@Composable
fun EditTextComponent(
    label :String,
    icon: ImageVector,
    iconPainter: Painter,
    controlImageType: Int,
    paddingTop: Dp,
    paddingBottom: Dp,
    paddingStart: Dp,
    paddingEnd: Dp
){
    Box(
        modifier = Modifier
            .padding(start = paddingStart, top = paddingTop, bottom = paddingBottom,end = paddingEnd)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                //.padding(top = 57.35.dp)
        ) {

            val textState = remember { mutableStateOf(TextFieldValue()) }
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp),
                value = textState.value,
                label = { Text(label, color = LightBlue, fontWeight = FontWeight.Bold) },
                onValueChange = { textState.value = it },
                placeholder = {
                    Text(text = "")
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = LightBlue,
                    unfocusedBorderColor = LightBlue
                ),
                trailingIcon = {
                    if(controlImageType == 0){
                        Icon(iconPainter, "", tint = LightBlue)
                    }else{
                        Icon(icon, "", tint = LightBlue)
                    }
                },
                singleLine = true
            )

        }
    }
}
