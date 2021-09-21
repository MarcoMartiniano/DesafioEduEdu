package com.marco.appeduedu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.marco.appeduedu.ui.AddStudentScreen
import com.marco.appeduedu.ui.theme.EduEduTheme
import com.marco.appeduedu.ui.HomeScreen
import com.marco.appeduedu.ui.StudentCardView
import com.marco.appeduedu.ui.StudentSelectScreen


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EduEduTheme {
                //HomeScreen()
                //AddStudentScreen()
                //StudentCardView()
                StudentSelectScreen()
            }
        }
    }


}

