val mapIntString = mapOf(0 to "*", 3 to "Foo", 5 to "Bar", 7 to "Qix")
val replaceNumberList = listOf("Foo", "Bar", "Qix")

fun Char.toIntValue() = Character.getNumericValue(this)

fun compute(numberString: String): String {
    val numberInt = numberString.toIntOrNull() ?: return ""
    var returnValue = ""

    val numbersToCheck = listOf(3, 5, 7)
    numbersToCheck.asSequence()
        .filter { numberInt % it == 0 }
        .forEach { returnValue += mapIntString[it]}

    numberString.asSequence()
        .filter { mapIntString.containsKey(it.toIntValue()) }
        .forEach { returnValue += mapIntString[it.toIntValue()]}

    val keepString = replaceNumberList.any { returnValue.contains(it) }

    return if (keepString) returnValue else numberString.replace("0", mapIntString[0] ?: "0")
}