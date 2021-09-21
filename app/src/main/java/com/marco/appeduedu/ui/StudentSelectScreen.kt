package com.marco.appeduedu.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.marco.appeduedu.R
import com.marco.appeduedu.ui.theme.*

@Composable
fun StudentSelectScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            HeaderSectionSelectStudent()
            SearchSection()
            TextSection()
            ChangeScreenButtonsSection()
            StudentList()
        }
        BottomMenu(items = listOf(
            R.drawable.icon_inicio,
            R.drawable.icon_alunos,
            R.drawable.icon_ajuda,
            R.drawable.icon_configuracoes
        ), modifier = Modifier.align(Alignment.BottomCenter))
    }
}

//HearSection
@Composable
fun HeaderSectionSelectStudent() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 17.dp)
                .height(50.dp),
        ) {

            Text(
                text = "Selecionar Aluno",
                style = MaterialTheme.typography.h1,
                modifier = Modifier.padding(start = 18.5.dp)

            )
            Row() {
                Icon(
                    painter = painterResource(R.drawable.ic_close),
                    contentDescription = "Arrow back",
                    tint = LightBlue,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(45.dp))
            }

        }

    }

}

@Composable
fun SearchSection(){
    val textState = remember { mutableStateOf(TextFieldValue()) }
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 31.dp, end = 30.dp)
            .height(55.dp),
        value = textState.value,
        label = {Text("Pesquisar",color = LightGrey,fontWeight = FontWeight.Bold)},
        onValueChange = { textState.value = it },
        placeholder = {
            Text(text = "")
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = LightGrey,
            unfocusedBorderColor = LightGrey
        ),
        trailingIcon = {
            Icon(Icons.Filled.Search, "", tint = LightGrey)
        },
        singleLine = true
    )
}

@Composable
fun TextSection(){
    Text(
        text = "Filtrar por",
        style = MaterialTheme.typography.h1,
       modifier = Modifier
           .padding(start = 40.dp, top = 11.dp)
           .fillMaxWidth()

    )
}
@Composable
fun ChangeScreenButtonsSection(){

    Row(
        modifier = Modifier
            .padding(top = 6.dp)
            .height(31.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            onClick = { /*TODO*/ },
            modifier = Modifier
                .height(35.dp)
                .width(176.dp)
                .offset(x = 15.dp),
            shape = Shapes.large

        ) {
            Text(text = "Nome",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = LightBlue
            )
        }
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = LightBlue),
            onClick = { /*TODO*/ },
            modifier = Modifier
                .height(35.dp)
                .width(176.dp)
                .offset(x = (-15).dp),
            shape = Shapes.large

        ) {
            Text(text = "Ano",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

    }
}

@Composable
fun StudentList(){
    LazyColumn (){

    }
}
