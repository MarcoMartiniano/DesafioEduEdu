package com.marco.appeduedu.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.marco.appeduedu.R
import com.marco.appeduedu.ui.theme.LightBlue
import com.marco.appeduedu.ui.theme.Shapes

@Composable
fun StudentCardView() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            //.background(Color.Gray)
            .size(163.dp, 188.dp),
        verticalArrangement = Arrangement.Center

    ) {
        Card(
            elevation = 6.dp,
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.size(151.dp, 175.dp)//.shadow(10.dp)
        ) {
            Column(modifier = Modifier.padding(top = 11.dp,start = 10.dp,end = 11.dp)) {
                Image(painter = painterResource(id = R.drawable.sr_goiaba),
                    contentDescription = null,
                    modifier = Modifier.size(126.dp,106.dp))
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = "Ana Luiza",
                    style = MaterialTheme.typography.h2
                )
                Text(
                    text = "1º ano",
                    style = MaterialTheme.typography.h3,
                )

            }
        }

    }

}