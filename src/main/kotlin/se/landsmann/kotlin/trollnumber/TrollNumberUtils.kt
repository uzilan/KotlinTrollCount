package se.landsmann.kotlin.trollnumber

/**
 * An extension method to create troll numbers from strings.
 *
 * Examples:
 * * "one".toTrollNumber => one
 * * "many-two".toTrollNumber => many-two
 * * "lots".toTrollNumber => lots
 */
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

/**
 * A way to construct complex troll numbers using the minus sign.
 *
 * Examples:
 * * many-one => many-one
 * * many-many-three => many-many-three
 * * many-many-many-two => many-many-many-two
 */
operator fun TrollNumber.minus(other: TrollNumber): TrollNumber = ComplexTrollNumber(listOf(this, other))
