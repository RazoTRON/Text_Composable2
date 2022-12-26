package org.hyperskill.textcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShortText("Short text")
        }
    }
}
// DO NOT change the code above!

@Composable
fun ShortText(text: String) {
    Text(
        text = text,
        color = if (text.length > 20) Color.Red else Color.Black
    )
}