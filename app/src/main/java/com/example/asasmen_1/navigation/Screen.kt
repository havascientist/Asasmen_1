package com.example.asasmen_1.navigation

sealed class Screen(val route: String){
    data object Home: Screen("mainScreen")
    data object About: Screen("aboutScreen")
    data object Desc: Screen("descScreen")

}
