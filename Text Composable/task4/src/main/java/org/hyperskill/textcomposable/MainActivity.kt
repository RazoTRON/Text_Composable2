package org.hyperskill.textcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextGeometricTransform
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StyledText(text = "test")
        }
    }
}
// DO NOT change the code below!

@Composable
fun StyledText(text: String) {
//    Text(
//        text = text,
//        style = TextStyle(
//            shadow = Shadow(
//                color = Color.Green,
//                blurRadius = 3f
//            )
//        ),
//    )
    Text(text = buildAnnotatedString {
        withStyle(SpanStyle(shadow = Shadow(
            color = Color.Green,
            blurRadius = 3f
        ))) {
            append(text)
        }
    })
}

@Preview
@Composable
fun test() {
    StyledText(text = "Matrix")
}