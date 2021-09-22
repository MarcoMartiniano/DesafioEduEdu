package com.marco.appeduedu.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.marco.appeduedu.view.ui.*
import com.marco.appeduedu.presentation.theme.EduEduTheme


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EduEduTheme {

                Surface() {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.HomeScreen.route
                    ) {

                        composable(
                            route = Screen.HomeScreen.route
                        ) {
                            HomeScreen(navController)
                        }
                        composable(
                            route = Screen.RegisterScreen.route
                        ) {
                            RegisterScreen(navController)
                        }

                        composable(
                            route = Screen.AddStudentScreen.route
                        ) {
                            AddStudentScreen()
                        }
                        composable(
                            route = Screen.SelectStudentScreen.route
                        ) {
                            StudentSelectScreen()
                        }
                        composable(
                            route = Screen.RecoveryPasswordScreen.route
                        ) {
                            PasswordRecoveryScreen(navController)
                        }

                    }
                }

            }

        }

    }

}

