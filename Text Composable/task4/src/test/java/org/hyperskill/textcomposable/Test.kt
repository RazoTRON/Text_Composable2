package org.hyperskill.textcomposable

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class MessageTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testSayMyName() {
        composeTestRule.setContent {
            StyledText(text = "Matrix")
        }

        composeTestRule
            .onNodeWithText("Matrix", ignoreCase = true).assert(
                SemanticsMatcher.expectValue(
                    semStyleKey, TextStyle(
                        shadow = Shadow(
                            color = Color.Green,
                            blurRadius = 3f
                        )
                    )
                ).or(
                    SemanticsMatcher.expectValue(
                        semAnnotatedStringSpanStyleKey, SpanStyle(
                            shadow = Shadow(
                                color = Color.Green,
                                blurRadius = 3f
                            )
                        )
                    )
                )
            )
    }
}