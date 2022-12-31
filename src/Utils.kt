import java.math.BigInteger
import java.nio.file.Paths
import java.security.MessageDigest
import kotlin.io.path.readText

/**
 * Reads lines from the given input txt file.
 */
fun readInputLines(name: String) = Paths.get("src", "inputs", "$name.txt").toFile()
    .readLines()

fun readInputText(name: String): String = Paths.get("src", "inputs", "$name.txt")
    .readText()

/**
 * Converts string to md5 hash.
 */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')
