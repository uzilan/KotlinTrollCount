package se.landsmann.kotlin.trollnumber

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SimpleTrollNumberTest {

    @Test
    fun constants_should_have_correct_values() {
        assertEquals(1, one.value)
        assertEquals(2, two.value)
        assertEquals(3, three.value)
        assertEquals(4, many.value)
        assertEquals(16, lots.value)
    }

    @Test
    fun constants_should_have_correct_toString_value() {
        assertEquals("one", one.toString())
        assertEquals("two", two.toString())
        assertEquals("three", three.toString())
        assertEquals("many", many.toString())
        assertEquals("lots", lots.toString())
        assertEquals("unknown", SimpleTrollNumber(42).toString())
    }

    @Test
    fun parsing_should_give_correct_constants() {
        assertEquals("one".toTrollNumber().value, 1)
        assertEquals("two".toTrollNumber().value, 2)
        assertEquals("three".toTrollNumber().value, 3)
        assertEquals("many".toTrollNumber().value, 4)
        assertEquals("lots".toTrollNumber().value, 16)
    }

    @Test
    fun parse_wrong_stuff_should_throw_exception() {
        assertThrows(Exception::class.java, { "five".toTrollNumber() })
    }
}