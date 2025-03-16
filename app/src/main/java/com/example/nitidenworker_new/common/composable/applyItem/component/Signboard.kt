package com.example.nitidenworker_new.common.composable.applyItem.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nitidenworker_new.common.composable.applyItem.SignboardType
import com.example.nitidenworker_new.ui.theme.HiraginoFontFamily

@Composable
fun Signboard(
    signboardType: SignboardType,
    modifier: Modifier
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = signboardType.backgroundColor),
        shape = RoundedCornerShape(4.dp),
        modifier = modifier
            .width(80.dp)
            .height(24.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = signboardType.text,
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = HiraginoFontFamily,
                    fontWeight = FontWeight.Black,
                    color = Color.White
                )
            )
        }
    }
}