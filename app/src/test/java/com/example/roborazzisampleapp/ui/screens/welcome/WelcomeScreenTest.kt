package com.example.roborazzisampleapp.ui.screens.welcome

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.roborazzisampleapp.ScreenshotTest
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class WelcomeScreenTest : ScreenshotTest() {

    @Test
    fun welcomeScreen() {
        composeTestRule.setContent {
            WelcomeScreen()
        }
    }
}
