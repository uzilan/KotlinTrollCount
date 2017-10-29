package se.landsmann.kotlin.trollnumber

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class ComplexTrollNumberKtTest {

    @Test
    fun parse_complex_number_should_result_in_a_correct_value() {
        Assertions.assertEquals(6, "many-two".toTrollNumber().value)
        Assertions.assertEquals(11, "many-many-three".toTrollNumber().value)
        Assertions.assertEquals(many.value, "many".toTrollNumber().value)
        Assertions.assertEquals(lots.value, "many-many-many-many".toTrollNumber().value)
        Assertions.assertEquals(lots.value, "lots".toTrollNumber().value)
    }

    @Test
    fun parse_complex_numbers_should_give_correct_toString() {
        Assertions.assertEquals("many-one", "many-one".toTrollNumber().toString())
        Assertions.assertEquals("many-many", "many-many".toTrollNumber().toString())
        Assertions.assertEquals("many-many-three", "many-many-three".toTrollNumber().toString())
    }

    @Test
    fun creating_complex_troll_numbers_should_work() {
        val five = many - one
        val fourteen = many - many - many - two

        Assertions.assertEquals("many-one", five.toString())
        Assertions.assertEquals("many-many-many-two", fourteen.toString())

        Assertions.assertEquals(5, five.value)
        Assertions.assertEquals(14, fourteen.value)
    }
}