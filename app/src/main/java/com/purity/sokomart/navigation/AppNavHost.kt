package com.purity.sokomart.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.purity.sokomart.ui.screens.about.AboutScreen
import com.purity.sokomart.ui.screens.contact.ContactScreen
import com.purity.sokomart.ui.screens.dashboard.DashboardScreen
import com.purity.sokomart.ui.screens.home.HomeScreen
import com.purity.sokomart.ui.screens.intent.IntentScreen
import com.purity.sokomart.ui.screens.item.ItemScreen
import com.purity.sokomart.ui.screens.service.ServiceScreen
import com.purity.sokomart.ui.screens.splash.SplashScreen
import com.purity.sokomart.ui.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_MORE) {
            MoreScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }

        composable(ROUT_ASSIGN) {
            AssignScreen(navController)
        }



    }
}

@Composable
fun AssignScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun MoreScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}