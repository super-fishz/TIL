# [save the prisoner](https://www.hackerrank.com/challenges/save-the-prisoner/problem)
## problem
## solve
```kotlin
import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    val i = s + m - 1
    return when {
        i > n && (i % n == 0) -> n
        i > n && !(i % n == 0) -> i%n
        else -> i
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nms = scan.nextLine().split(" ")

        val n = nms[0].trim().toInt()

        val m = nms[1].trim().toInt()

        val s = nms[2].trim().toInt()

        val result = saveThePrisoner(n, m, s)

        println(result)
    }
}
```
