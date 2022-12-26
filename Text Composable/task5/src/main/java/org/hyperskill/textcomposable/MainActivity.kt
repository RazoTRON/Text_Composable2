package org.hyperskill.textcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.material.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SayMyName()
        }
    }
}
// DO NOT change the code above!

@Composable
fun SayMyName() {
    Text(
        text = buildAnnotatedString {
            withStyle(SpanStyle(color = Color.Black)) {
                append("Say ")
            }
            withStyle(SpanStyle(fontWeight = FontWeight.SemiBold, color = Color.Black)) {
                append("my ")
            }
            withStyle(SpanStyle(fontWeight = FontWeight.ExtraBold, color = Color.Red)) {
                append("NAME")
            }
        }
    )
}