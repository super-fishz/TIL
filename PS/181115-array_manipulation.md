# [Array Manipulation](https://www.hackerrank.com/challenges/crush/problem)
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

fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
    val arr = Array(n + 1) { 0L }
    var max = 0L
    var sum = 0L

    queries.forEach { query ->
        arr[query[0] - 1] += query[2].toLong()
        arr[query[1]] -= query[2].toLong()
    }
    for (i in 0 until arr.size) {
        sum += arr[i]
        max = kotlin.math.max(sum, max)
    }
    
    return max
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val queries = Array<Array<Int>>(m, { Array<Int>(3, { 0 }) })

    for (i in 0 until m) {
        queries[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = arrayManipulation(n, queries)

    println(result)
}
```
for loop 을 줄이는게 핵심이었당...
