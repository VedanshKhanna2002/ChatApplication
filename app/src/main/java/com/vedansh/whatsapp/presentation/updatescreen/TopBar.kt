package com.vedansh.whatsapp.presentation.updatescreen

import android.R.attr.contentDescription
import android.R.attr.text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vedansh.whatsapp.R
import androidx.compose.material3.Icon

@Composable
@Preview
fun TopBar(){
    var isSearching by remember{
        mutableStateOf(false)
    }
    var search by remember {
        mutableStateOf("")
    }
    var showmenu by remember{
        mutableStateOf(false)
    }
    Box(modifier = Modifier.fillMaxWidth()){
        Column(){
            Row(){
                if(isSearching == true){
                    TextField(value = search, onValueChange = {
                        search = it
                    },
                        placeholder = {
                            Text(text = "Search")
                        },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ) ,
                        modifier = Modifier.padding(12.dp), singleLine = true)

                }else{
                    Text(text = "Updates",
                        fontSize = 28.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 12.dp , top = 4.dp)
                        )
                }
                Spacer(modifier = Modifier.weight(1f))
                if(isSearching){
                    IconButton(onClick = {isSearching = false}) {
                        Icon(painter = painterResource(id = R.drawable.cross) ,
                            contentDescription = null,
                            modifier = Modifier.size(15.dp)
                                .padding(top = 8.dp))
                    }

                }else{
                    IconButton(onClick = {}) {
                        Icon(painter = painterResource(R.drawable.camera) ,
                            contentDescription = null,
                            modifier = Modifier.size(24.dp))
                    }

                    IconButton(onClick = {isSearching = true}) {
                        Icon(painter = painterResource(R.drawable.search) ,
                            contentDescription = null,
                            modifier = Modifier.size(24.dp))
                    }

                    IconButton(onClick = {showmenu = true}) {
                        Icon(painter = painterResource(R.drawable.more) ,
                            contentDescription = null,
                            modifier = Modifier.size(24.dp))

                        DropdownMenu(expanded = showmenu , onDismissRequest = {showmenu = false}) {
                            DropdownMenuItem(text = {Text(text = "Status Privacy")} , onClick = {showmenu = false})
                            DropdownMenuItem(text = {Text(text = "Create Channel")} , onClick = {showmenu = false})
                            DropdownMenuItem(text = {Text(text = "Settings")} , onClick = {showmenu = false})
                        }
                    }
                }


            }
            HorizontalDivider()
        }

    }

}