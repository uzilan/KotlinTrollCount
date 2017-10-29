package se.landsmann.kotlin.trollnumber

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TrollNumberUtilsTest {

    @Test
    fun creating_troll_numbers_from_integers_should_generate_correct_troll_numbers() {
        val three = 3.toTrollNumber()
        val five = 5.toTrollNumber()
        val eleven = 11.toTrollNumber()

        assertEquals("three", three.toString())
        assertEquals("many-one", five.toString())
        assertEquals("many-many-three", eleven.toString())
    }

    @Test
    fun adding_two_troll_numbers_should_generate_correct_complex_troll_numbers() {
        val two = one + one
        val five = many + one
        val fifteen = many-many-many + three
        val ten = (many-one) + (many-one)

        assertEquals(2, two.value)
        assertEquals(5, five.value)
        assertEquals(15, fifteen.value)
        assertEquals(10, ten.value)

        assertEquals("two", two.toString())
        assertEquals("many-one", five.toString())
        assertEquals("many-many-many-three", fifteen.toString())
        assertEquals("many-many-two", ten.toString())
    }
}