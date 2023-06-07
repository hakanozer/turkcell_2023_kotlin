package com.example.days_21

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.days_21.ui.theme.Days21Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Days21Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(modifier = Modifier.padding(24.dp)) {
                        Greeting("Android")
                        Greeting("Kotlin")
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}



@Composable
fun userName(name: MutableState<String>) {

    var expanded by remember { mutableStateOf(false) }
    val extraPadding by animateDpAsState(
        if (expanded) 48.dp else 0.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow
        )
    )

    TextField(
        value = name.value,
        onValueChange = {
            name.value = it
            Log.d("String", name.value)
            expanded = name.value == "Ali"
        },
        modifier = Modifier
            .absoluteOffset(10.dp,10.dp)
            .padding(bottom = extraPadding.coerceAtLeast(0.dp))
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Days21Theme {
        val name = remember {
            mutableStateOf("")
        }
        Column(modifier = Modifier.padding(24.dp)) {
            Greeting("Java")
            Greeting("Kotlin")
            userName(name)
            OutlinedButton(
                onClick = {
                            Log.d("Click", name.value)
                          }, modifier = Modifier.padding(10.dp))
            {
                Text(text = "Save")
            }
        }
    }
}