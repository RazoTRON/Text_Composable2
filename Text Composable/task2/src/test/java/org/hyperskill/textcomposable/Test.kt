package org.hyperskill.textcomposable

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ShortTextTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testShortText() {
        composeTestRule.setContent {
            ShortText("Short text")
            ShortText("This is too long text and it should be red")
        }

        composeTestRule
            .onNodeWithText("short text", substring = true, ignoreCase = true)
            .assert(SemanticsMatcher.expectValue(semColorKey, Color.Black))


        composeTestRule
            .onNodeWithText("long text", substring = true, ignoreCase = true)
            .assert(SemanticsMatcher.expectValue(semColorKey, Color.Red))
    }
}