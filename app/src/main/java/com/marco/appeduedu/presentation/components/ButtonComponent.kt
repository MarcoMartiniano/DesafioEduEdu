package com.marco.appeduedu.presentation.components

import android.service.autofill.OnClickAction
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.marco.appeduedu.presentation.theme.Shapes

@Composable
fun ButtonComponent (
    text: String,
    backgroundColor: Color,
    textColor: Color,
    offset: Dp,
    paddingTop: Dp,
    paddingBottom: Dp,
    paddingStart: Dp = 31.dp,
    paddingEnd: Dp = 30.dp,
    onClick: () -> Unit
){
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor),
            shape = Shapes.large,
            onClick = onClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = paddingStart, top = paddingTop, bottom = paddingBottom,end = paddingEnd)
                .height(50.dp)
                .offset( y = offset)

        ) {
            Text(
                text = text,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = textColor
            )
        }
    }
}