package com.example.mod4demo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mod4demo2.ui.theme.CoursAndroidHCDA2410Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoursAndroidHCDA2410Theme {
                Counter()
            }
        }
    }
}

@Composable
fun Counter(
    viewModel: CounterViewModel = viewModel(),
    modifier: Modifier = Modifier
) {

    val counter by viewModel.counter.collectAsState()
//    val plus by viewModel.plus.collectAsState()

    Row(
        verticalAlignment = Alignment.CenterVertically
    ){
        IconButton(
            onClick = {
                viewModel.decremente()
                viewModel.plus++
            }
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = null
            )

        }
        Text(text = "$counter, + = ${viewModel.plus}")
        IconButton(
            onClick = {
                viewModel.incremente()
            }
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowUp,
                contentDescription = null
            )

        }
    }

}

@Preview
@Composable
private fun Preview() {
    Counter()
}

