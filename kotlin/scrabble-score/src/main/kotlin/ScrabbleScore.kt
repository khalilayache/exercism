class ScrabbleScore {
    companion object {
        fun scoreWord(input: String): Int {
            require(input.isNotBlank() && input.isNotEmpty()) { return 0 }
            return input.map { char -> getValue(char.toUpperCase()) }.reduce { total, charValue -> total + charValue }
        }

        private fun getValue(char: Char): Int {
            return when (char) {
                'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> 1
                'D', 'G' -> 2
                'B', 'C', 'M', 'P' -> 3
                'F', 'H', 'V', 'W', 'Y' -> 4
                'K' -> 5
                'J', 'X' -> 8
                'Q', 'Z' -> 10
                else -> 0
            }
        }
    }
}