package com.marco.appeduedu.ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.marco.appeduedu.R
import com.marco.appeduedu.ui.theme.*
import com.marco.appeduedu.ui.theme.BottomMenu

@Composable
fun AddStudentScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column {
            HeaderSectionAddStudent()
            EditTextNameStudentSection()
            AvatarImageSection()
            ButtonChangeAvaterSection()
            AutorizationSection()
            SaveStudentSection()
        }
        BottomMenu(items = listOf(
            R.drawable.icon_inicio,
            R.drawable.icon_alunos,
            R.drawable.icon_questionario,
            R.drawable.icon_ajuda,
            R.drawable.icon_configuracoes
        ), modifier = Modifier.align(Alignment.BottomCenter))
    }
}


//HearSection
@Composable
fun HeaderSectionAddStudent() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .fillMaxWidth()
            .background(HeaderWhite)
            .height(50.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 17.dp)
                .background(HeaderWhite)
                .height(50.dp),
        ) {

            Icon(
                painter = painterResource(R.drawable.ic_arrow_back),
                contentDescription = "Arrow back",
                tint = LightBlue,
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = "Adicionar Aluno",
                style = MaterialTheme.typography.h1,
                modifier = Modifier.padding(start = 18.5.dp)

            )
        }

    }

}

@Composable
fun EditTextNameStudentSection(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 65.5.dp)
    ) {

        val textState = remember { mutableStateOf(TextFieldValue()) }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 31.dp, end = 30.dp)
                .height(62.dp),
            value = textState.value,
            label = {Text("Nome",color = LightBlue,fontWeight = FontWeight.Bold)},
            onValueChange = { textState.value = it },
            placeholder = {
                Text(text = "")
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = LightBlue,
                unfocusedBorderColor = LightBlue
            ),
            trailingIcon = {
                Icon(Icons.Filled.Person, "", tint = LightBlue)
            },
            singleLine = true
        )

    }

}

@Composable
fun AvatarImageSection(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 18.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.avatar12),
            contentDescription = null,
            modifier = Modifier.size(161.dp,162.dp)
        )
    }
}

@Composable
fun ButtonChangeAvaterSection() {
    Box(
        modifier = Modifier
            .padding(top = 15.dp,start = 71.dp,end = 71.dp)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = BlueMenu),
            shape = Shapes.large,
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 31.dp, end = 30.dp)
                .height(50.dp)
                .offset(y = 5.dp)

        ) {

        }

        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            shape = Shapes.large,
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 31.dp, end = 30.dp)
                .height(50.dp)
                .border(1.dp,LightBlue,Shapes.large)

        ) {
            Text(
                text = "Mudar avatar",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = LightBlue
            )
        }
    }
}

@Composable
fun AutorizationSection(){
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(top = 25.dp, start = 24.dp, end = 24.dp)
            .fillMaxWidth()
            .height(62.dp)) {

        val checkedState = remember { mutableStateOf(false) }
        Checkbox(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it }
        )
        Spacer(modifier = Modifier.width(11.dp))
        Text(text = "Eu autorizo o EduEdu a coletar e processar os dados do meu filho(a) conforme a política de privacidade.",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = LightBlue
        )
    }
}

@Composable
fun SaveStudentSection(){


        Box(
            modifier = Modifier
                .padding(top = 20.dp,start = 30.dp,end = 30.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = BlueMenu),
                shape = Shapes.large,
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .offset(y = 5.dp)

            ) {

            }

            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = LightBlue),
                shape = Shapes.large,
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)

            ) {
                Text(
                    text = "Salvar",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }


}


