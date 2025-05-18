package com.vedansh.whatsapp.presentation.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vedansh.whatsapp.R
import com.vedansh.whatsapp.presentation.bottomnavigation.BottomNavigation

@Composable
@Preview
fun UpdateScreen(){
    Scaffold (
        floatingActionButton = {
            FloatingActionButton(onClick = {/*TODO*/ },
                containerColor = colorResource(id = R.color.light_green),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White) {
                Icon(painter = painterResource(id = R.drawable.camera) ,
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)

                )

            }
        },
        bottomBar = {
            BottomNavigation()
        },
        topBar = {
            TopBar()
        }
    ){
        Column (modifier = Modifier.padding(it)){  }

    }

}