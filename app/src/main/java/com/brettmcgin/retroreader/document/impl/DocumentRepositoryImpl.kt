package com.brettmcgin.retroreader.document.impl

import com.brettmcgin.retroreader.document.api.DocumentRepository

class DocumentRepositoryImpl : DocumentRepository {
    override fun getAll() = setOf(DefaultDocument)
}
