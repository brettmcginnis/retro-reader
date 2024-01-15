package com.brettmcgin.retroreader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.brettmcgin.retroreader.document.impl.DefaultDocument
import com.brettmcgin.retroreader.document.ui.DocumentContent
import com.brettmcgin.retroreader.ui.theme.RetroReaderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RetroReaderTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DocumentContent(DefaultDocument)
                }
            }
        }
    }
}
