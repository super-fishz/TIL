# [Birthday Chocolate]()
## Problem
array 에서 m 만큼 길이를 탐색하는 문제.

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

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var count = 0
    s.forEachIndexed{ index, element ->
        val endIndex = if (index+m-1 > s.size - 1) s.size - 1 else index+m-1
        if (s.sliceArray(IntRange(index, endIndex)).sum() == d)
            count++
    }
    
    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}

```
