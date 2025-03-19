package com.example.roborazzisampleapp.ui.screens.products

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.roborazzisampleapp.ScreenshotTest
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ProductsScreenTest: ScreenshotTest() {

    @Test
    fun productsScreen() {
        composeTestRule.setContent {
            ProductsScreen(
                items = MockProducts
            )
        }
    }
}
