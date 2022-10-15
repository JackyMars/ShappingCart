package com.oy.shappingcart.presentation.components


import android.widget.Toast
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.R
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Dehaze
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeTopBar(
    navigationController: NavController
) {

    TopAppBar(
        title = {
        },
        navigationIcon = {
            IconButton(onClick = {
    //            navigationController.navigate(R.id.action_detailFragment_to_listFragment)
            }) {
                Icon(Icons.Filled.Menu, "navigationIcon")
            }
        },
        actions = {
                  //shapping cart icon
            IconButton(onClick = {
              Toast.makeText(LocalContext.current, "This is a Sample Toast", Toast.LENGTH_LONG).show()
            }) {
                Icon(Icons.Filled.Menu, "navigationIcon")
            }
        },
        backgroundColor = Color.LightGray,
        contentColor = Color.White,
        elevation = 10.dp
    )

}