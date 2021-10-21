package com.ytl.testingcompose

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class CounterTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun counter_initially_zero(){
        val text = composeTestRule.activity.getString(R.string.clicks, 0)
        composeTestRule.onNodeWithText(text).assertExists()
    }

    @Test
    fun clickButton_incrementsCounter(){
        val text = composeTestRule.activity.getString(R.string.increment_counter)
        val click_text = composeTestRule.activity.getString(R.string.clicks, 1)
        composeTestRule.onNodeWithText(text).performClick()
        composeTestRule.onNodeWithText(click_text).assertExists()
    }
}