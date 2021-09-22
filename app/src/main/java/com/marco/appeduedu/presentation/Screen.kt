package com.marco.appeduedu.presentation

sealed class Screen(val route: String) {
    object HomeScreen: Screen("home_screen")
    object RegisterScreen: Screen("register_screen")
    object SelectStudentScreen: Screen("select_screen")
    object AddStudentScreen: Screen("add_student_screen")
    object RecoveryPasswordScreen: Screen("recovery_password_screen")
}
