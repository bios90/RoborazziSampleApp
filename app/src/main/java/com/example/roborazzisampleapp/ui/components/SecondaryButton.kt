package com.example.roborazzisampleapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.roborazzisampleapp.ui.theme.PurpleLight
import com.example.roborazzisampleapp.ui.theme.RoborazziSampleAppTheme
import com.example.roborazzisampleapp.ui.theme.Typography

@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    OutlinedButton(
        modifier = modifier
            .fillMaxWidth(),
        border = BorderStroke(1.dp, PurpleLight),
        shape = CircleShape,
        onClick = onClick,
        content = {
            Text(
                style = Typography.titleMedium,
                fontWeight = FontWeight.Normal,
                color = PurpleLight,
                text = text
            )
        }
    )
}

@Preview
@Composable
private fun Preview() {
    RoborazziSampleAppTheme {
        SecondaryButton(
            text = "SecondaryButton",
            onClick = {}
        )
    }
}

