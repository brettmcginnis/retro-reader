package com.brettmcgin.retroreader.bookmark.api

/**
 * @property position The literal line position in the document
 */
sealed interface Bookmark {
    val  position: Int
}

interface Destination : Bookmark {
    val name: String
}

/**
 * @property targets should include at least one [Int] that matches a [Destination.position]
 */
interface Reference : Bookmark {
    val targets: List<Int>
}
