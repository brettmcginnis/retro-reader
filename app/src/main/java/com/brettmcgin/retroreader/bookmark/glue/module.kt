package com.brettmcgin.retroreader.bookmark.glue

import com.brettmcgin.retroreader.bookmark.api.Destination
import com.brettmcgin.retroreader.bookmark.api.Reference
import com.brettmcgin.retroreader.bookmark.impl.DefaultDestination
import com.brettmcgin.retroreader.bookmark.impl.DefaultReference
import com.brettmcgin.retroreader.bookmark.impl.links

val Int.links get() = links(this, references, destinations)

private val destinations: List<Destination>
    get() = listOf(
        DefaultDestination("Controls", 194),
        DefaultDestination("Full Walkthrough", 227),
        DefaultDestination("Narshe", 231),
    )

private val references: List<Reference>
    get() = listOf(
        DefaultReference(listOf(193, 194, 195), 35),
        DefaultReference(listOf(226, 227, 228), 36),
        DefaultReference(listOf(229, 230, 231, 232), 37),
    )
