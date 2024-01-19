package com.brettmcgin.retroreader

import com.brettmcgin.retroreader.document.glue.DefaultDocument
import org.junit.Test

import org.junit.Assert.*

class DefaultDocumentTest {
    @Test
    fun `Default Document`() = with(DefaultDocument) {
        assertEquals(5728, lineCount)
        assertEquals(88, maxCharacterLineCount)
    }
}
