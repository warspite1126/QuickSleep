package navy.warspite.spigot.QuickSleep.Commands

fun String.possessive(): String {
    val pluralS1 = arrayOf("o", "s", "x", "O", "S", "X")
    val pluralS2 = arrayOf("ch", "sh", "CH", "SH")
    val vowels = arrayOf("a", "i", "u", "e", "o", "A", "I", "U", "E", "O")
    val finalPreChar = this.substring(this.length - 2, this.length - 1)
    val final1Char = this.substring(this.length - 1)
    val final2Char = this.substring(this.length - 2)

    for (str in pluralS1) {
        if (final1Char == str) {
            return this + "es"
        }
    }
    for (str in pluralS2) {
        if (final2Char == str) {
            return this + "es"
        }
    }
    if (final1Char == "y" || final1Char == "Y") {
        for (str in vowels) {
            if (finalPreChar == str) {
                return this + "s"
            } else {
                return this.substring(0, this.length - 1) + "ies"
            }
        }
    }
    return this + "s"
}