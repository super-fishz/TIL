# [Counting Valleys](https://www.hackerrank.com/challenges/counting-valleys/problem)
## Problem
스트링을 순차적으로 탐색하고, 직전 조건을 확인하는 문제

## Solve
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

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
    val up = "U"
    var valley = 0
    var count = 0
    s.chunked(1).forEach{
        if (it == up)
            count++
        else
            count--
        
        if (it == up && count == 0)
            valley++
    }
    return valley
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}
```
