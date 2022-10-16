package com.oy.shappingcart.presentation.components


import android.widget.Toast
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Dehaze
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun HomeTopBar(
    navigationController: NavController,
    scaffoldState: ScaffoldState,
    scope: CoroutineScope
) {

    val context = LocalContext.current

    TopAppBar(
        title = {
        },
        navigationIcon = {
            IconButton(onClick = {
                scope.launch {
                    scaffoldState.drawerState.apply {
                        if (isClosed) open() else close()
                    }
                }
            }) {
                Icon(Icons.Filled.Menu, "navigationIcon")
            }
        },
        actions = {
            //shapping cart icon
            IconButton(onClick = {
                Toast.makeText(context, "This is a shapping cart Toast", Toast.LENGTH_LONG).show()
            }) {
                Icon(Icons.Default.ShoppingCart, "navigationIcon")
            }
        },
        backgroundColor = Color.LightGray,
        contentColor = Color.White,
        elevation = 10.dp
    )

}