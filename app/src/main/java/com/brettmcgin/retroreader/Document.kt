package com.brettmcgin.retroreader

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import com.brettmcgin.retroreader.document.api.Document
import kotlinx.coroutines.launch

@Composable
fun DocumentContent(document: Document, onClicked: (sourceLine: Int) -> Int?, modifier: Modifier = Modifier) {
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    LazyColumn(modifier, state = listState) {
        document.lines.forEachIndexed { index, line ->
            item(index) {
                ClickableText(
                    text = AnnotatedString(line),
                    softWrap = false,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = TextUnit(15F, TextUnitType.Sp),
                        fontFamily = FontFamily.Monospace,
                    )
                ) {
                    onClicked(index)?.let { destination ->
                        coroutineScope.launch {
                            listState.animateScrollToItem(index = destination)
                        }
                    }
                }
            }
        }
    }
}
