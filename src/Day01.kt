fun main() {
    fun part1(input: String): Int = input
        .splitToSequence("\n{2}".toRegex())
        .map { it.split("\n".toRegex()) }
        .maxOf { list ->
            list
                .filter { string -> string.isNotEmpty() }
                .map(String::toInt)
                .sum()
        }

    fun part2(input: String): Int = input
        .splitToSequence("\n{2}".toRegex())
        .map { it.split("\n".toRegex()) }
        .map { list ->
            list
                .filter { string -> string.isNotEmpty() }
                .map(String::toInt)
                .sum()
        }.sortedDescending()
        .take(3)
        .sum()

    val testInput = readInputText("Day01_test")
    check(part1(testInput) == 24_000)
    check(part2(testInput) == 45_000)

    val input = readInputText("Day01")
    println(part1(input))
    println(part2(input))
}
