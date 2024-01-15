package com.brettmcgin.retroreader.bookmark.impl

import com.brettmcgin.retroreader.bookmark.api.Bookmark
import com.brettmcgin.retroreader.bookmark.api.Destination
import com.brettmcgin.retroreader.bookmark.api.Reference

class DefaultReference(
    override val targets: List<Int>,
    override val position: Int
) : Reference

data class DefaultDestination(
    override val name: String,
    override val position: Int,
) : Destination


internal fun links(
    input: Int,
    allReferences: List<Reference>,
    allDestinations: List<Destination>
): List<Int> = allDestinations
    .filterReferenceContainsDestination(allReferences.matchFrom(input))
    .toPositions() +
        allReferences.filterTargetContains(input).toPositions()

fun List<Reference>.matchFrom(input: Int) = filter { reference -> reference.position == input }
fun List<Bookmark>.toPositions() = map(Bookmark::position)

fun List<Destination>.filterReferenceContainsDestination(references: List<Reference>) =
    filter { destination -> references.any { it.targets.contains(destination.position) } }

fun List<Reference>.filterTargetContains(input: Int) =
    filter { reference -> reference.targets.contains(input) }
