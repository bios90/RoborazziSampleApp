package com.example.roborazzisampleapp.ui.screens.product_details

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.roborazzisampleapp.ScreenshotTest
import com.example.roborazzisampleapp.ui.screens.products.MockProducts
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ProductDetailsScreenTest: ScreenshotTest() {

    @Test
    fun productDetailsScreen() {
        composeTestRule.setContent {
            ProductDetailsScreen(
                product = MockProducts.get(5)
            )
        }
    }
}
