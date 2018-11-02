# [Day Of The Programmer](https://www.hackerrank.com/challenges/day-of-the-programmer/problem)
## Problem
when 절 같은 복잡한 조건문을 어떻게 표현하나,

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

// Complete the dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {
    val dop = 256
    val commonDay = 243
    val rest =   when {
        year < 1917 && (year % 4) == 0 -> 1
        year < 1917 && (year % 4) != 0 -> 0
        year == 1918 -> -13
        year > 1918 && (year % 400) == 0 -> 1
        year > 1918 && (year % 4) == 0 && (year % 100) != 0 -> 1
        else -> 0
    }
    val day = dop - commonDay - rest
    
    return "$day.09.$year"
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
```
