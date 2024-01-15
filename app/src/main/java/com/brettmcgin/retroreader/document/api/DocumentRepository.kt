package com.brettmcgin.retroreader.document.api

interface Document {
    val lineCount: Int
    val maxCharacterLineCount: Int

    val lines: List<String>
}

interface DocumentRepository {
    fun getAll() : Set<Document>
}
