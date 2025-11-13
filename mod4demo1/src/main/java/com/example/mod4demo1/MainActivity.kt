package com.example.mod4demo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.mod4demo1.ui.theme.CoursAndroidHCDA2410Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoursAndroidHCDA2410Theme {
                Form()
            }
        }
    }
}

@Composable
fun Form(modifier: Modifier = Modifier) {

    var firstname = ""
    var lastname = remember { mutableStateOf("") }
    var age by rememberSaveable {
        mutableStateOf("")
    }

    Column() {
        TextField(
            value = firstname,
            onValueChange = {
                firstname = it
            },
            label = { Text("Firstname ") }
        )
        TextField(
            value = lastname.value,
            onValueChange = {
                lastname.value = it
            },
            label = { Text("Lastname ") }
        )
        TextField(
            value = age,
            onValueChange = {
                age = it
            },
            label = { Text("Age ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

    }

}

@Preview
@Composable
private fun Preview() {
    Form()
}

