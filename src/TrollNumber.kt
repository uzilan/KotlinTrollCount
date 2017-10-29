open class TrollNumber(val value: Int) {
    override fun toString(): String {
        return when (value) {
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "many"
            16 -> "lots"
            else -> "unknown"
        }
    }
}

class ComplexTrollNumber(private val trollNumbers: List<TrollNumber> = mutableListOf()) :
        TrollNumber(trollNumbers.sumBy { tn -> tn.value }) {
    override fun toString(): String {
        return trollNumbers.joinToString("-")
    }
}

val one = TrollNumber(1)
val two = TrollNumber(2)
val three = TrollNumber(3)
val many = TrollNumber(4)
val lots = TrollNumber(16)

fun String.toTrollNumber(): TrollNumber {
    if (this.contains("-")) {
        val split = this.split("-")
        val trollNumbers = split.map { s -> s.toTrollNumber() }
        return ComplexTrollNumber(trollNumbers)
    }

    return when (this) {
        "one" -> one
        "two" -> two
        "three" -> three
        "many" -> many
        "lots" -> lots
        else -> throw Exception("Unknown troll number")
    }
}

