package com.brettmcgin.retroreader.document.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import com.brettmcgin.retroreader.document.api.Document

@Composable
fun DocumentContent(document: Document, modifier: Modifier = Modifier) {
    LazyColumn(modifier) {
        items(document.lines) { line ->
            Text(
                fontSize = TextUnit(7.5F, TextUnitType.Sp),
                text = line,
                fontFamily = FontFamily.Monospace
            )
        }
    }
}
