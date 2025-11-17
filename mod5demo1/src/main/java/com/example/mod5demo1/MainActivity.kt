package com.example.mod5demo1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.mod5demo1.ui.theme.CoursAndroidHCDA2410Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoursAndroidHCDA2410Theme {
                GoToTargetActivity()

            }
        }
    }
}


@Composable
fun GoToTargetActivity(modifier: Modifier = Modifier) {

    val context = LocalContext.current
    var name by rememberSaveable { mutableStateOf("") }

    Column {
        TextField(
            value = name,
            onValueChange = {
                name = it
            },
            label = { Text("Name ?") }
        )
        Button(
            onClick = {
                Intent(context, TargetActivity::class.java).also {
                    it.putExtra("name", name)
                    context.startActivity(it)
                }
//                val intent  = Intent(context, TargetActivity::class.java)
//                context.startActivity(intent)
//                Intent(context, TargetActivity::class.java).apply {
//                    context.startActivity(this)
//                }

            }
        ) {
            Text("GO TO !")
        }
    }
}