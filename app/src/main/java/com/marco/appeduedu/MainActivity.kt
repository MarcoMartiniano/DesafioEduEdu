package com.marco.appeduedu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.marco.appeduedu.ui.*
import com.marco.appeduedu.ui.theme.EduEduTheme


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EduEduTheme {
                //HomeScreen()
                AddStudentScreen()
                //StudentCardView()
                //StudentSelectScreen()
            }
        }
    }


}

