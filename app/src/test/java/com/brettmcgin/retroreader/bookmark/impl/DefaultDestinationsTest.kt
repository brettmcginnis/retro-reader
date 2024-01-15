package com.brettmcgin.retroreader.bookmark.impl

import org.junit.Assert.assertEquals
import org.junit.Test

private const val NAME = "NAME"
private const val DESTINATION_POSITION = 42
private const val DESTINATION_TWO_POSITION = 43
private const val SOURCE_POSITION = 1

class DefaultDestinationsTest {

    private val destination = DefaultDestination(NAME, DESTINATION_POSITION)
    private val destinationTwo = DefaultDestination(NAME, DESTINATION_TWO_POSITION)
    private val reference = DefaultReference(listOf(DESTINATION_POSITION), SOURCE_POSITION)
    private val referenceTwoDestinations =
        DefaultReference(listOf(DESTINATION_POSITION, DESTINATION_TWO_POSITION), SOURCE_POSITION)

    @Test
    fun `click on reference position, get destination`() =
        assertEquals(
            links(
                SOURCE_POSITION,
                listOf(reference),
                listOf(destination)
            ),
            listOf(DESTINATION_POSITION)
        )

    @Test
    fun `click on reference position, get destinations`() =
        assertEquals(
            links(
                SOURCE_POSITION,
                listOf(referenceTwoDestinations),
                listOf(destination, destinationTwo)
            ),
            listOf(DESTINATION_POSITION, DESTINATION_TWO_POSITION)
        )

    @Test
    fun `click on destination position, get source`() =
        assertEquals(
            links(
                DESTINATION_POSITION,
                listOf(reference),
                listOf(destination)
            ),
            listOf(SOURCE_POSITION)
        )

    @Test
    fun `click on destination position, get sources`() =
        assertEquals(
            links(
                DESTINATION_POSITION,
                listOf(reference, reference),
                listOf(destination)
            ),
            listOf(SOURCE_POSITION, SOURCE_POSITION)
        )
}
