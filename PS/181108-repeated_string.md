# [Repeated String]()
## Problem
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

// Complete the repeatedString function below.
fun repeatedString(s: String, n: Long): Long {
    val char = 'a'
    val charCount = s.count{it == char}
    val size = s.length
    val repeat = n/size
    val rest = (n%size).toInt()
    
    return charCount * repeat + s.substring(IntRange(0, rest - 1)).count{it == char}
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}
```
~하하 문제를 잘못이해했다.~
