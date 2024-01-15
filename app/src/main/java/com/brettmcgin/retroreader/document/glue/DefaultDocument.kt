package com.brettmcgin.retroreader.document.glue

import com.brettmcgin.retroreader.document.api.Document
import com.brettmcgin.retroreader.document.impl.FINAL_FANTASY_VI

object DefaultDocument : Document {
    override val lineCount: Int
        get() = lines.size

    override val maxCharacterLineCount: Int
        get() = lines.maxOf { it.length }

    override val lines: List<String>
        get() = FINAL_FANTASY_VI
}
