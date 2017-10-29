import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TrollNumberTest {

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
        assertEquals("unknown", TrollNumber(42).toString())
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

    @Test
    fun parse_complex_number_should_result_in_a_correct_value() {
        assertEquals(6, "many-two".toTrollNumber().value)
        assertEquals(11, "many-many-three".toTrollNumber().value)
        assertEquals(many.value, "many".toTrollNumber().value)
        assertEquals(lots.value, "many-many-many-many".toTrollNumber().value)
        assertEquals(lots.value, "lots".toTrollNumber().value)
    }

    @Test
    fun parse_complex_numbers_should_give_correct_toString() {
        assertEquals("many-one", "many-one".toTrollNumber().toString())
        assertEquals("many-many", "many-many".toTrollNumber().toString())
        assertEquals("many-many-three", "many-many-three".toTrollNumber().toString())
    }
}