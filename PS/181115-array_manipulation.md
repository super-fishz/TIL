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
    val arr = mutableListOf<Long>()
    repeat(n) { arr.add(0L) }
    queries.forEach { q ->
        for (i in (q[0]-1)..(q[1]-1)) {
            arr[i] += q[2].toLong()
        }
    }
    return arr.max()!!
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
또 타임아웃.... 음....
