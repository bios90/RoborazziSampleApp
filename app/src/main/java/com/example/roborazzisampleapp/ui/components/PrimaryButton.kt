package com.example.roborazzisampleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.roborazzisampleapp.ui.theme.PurpleDark
import com.example.roborazzisampleapp.ui.theme.PurpleLight
import com.example.roborazzisampleapp.ui.theme.RoborazziSampleAppTheme
import com.example.roborazzisampleapp.ui.theme.Typography

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val shape = CircleShape
    Button(
        modifier = modifier
            .clip(shape)
            .fillMaxWidth()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(PurpleDark, PurpleLight),
                ),
                shape = shape
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
        ),
        onClick = onClick,
        content = {
            Text(
                style = Typography.titleMedium,
                fontWeight = FontWeight.Bold,
                text = text
            )
        }
    )
}

@Preview
@Composable
private fun Preview() {
    RoborazziSampleAppTheme {
        PrimaryButton(
            text = "PrimaryButton",
            onClick = {}
        )
    }
}

