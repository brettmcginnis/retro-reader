package com.brettmcgin.retroreader.document.impl

import com.brettmcgin.retroreader.document.api.DocumentRepository
import com.brettmcgin.retroreader.document.glue.DefaultDocument

class DefaultDocumentRepository : DocumentRepository {
    override fun getAll() = setOf(DefaultDocument)
}
