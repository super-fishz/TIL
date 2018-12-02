# [New Year Chaos](https://www.hackerrank.com/challenges/new-year-chaos/problem)
## Problem
Interview Preparation Kit Array 마지막 문제
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

// Complete the minimumBribes function below.
fun minimumBribes(q: Array<Int>): Unit {
    var count = 0
    var flag = false

    for (i in (q.size - 1) downTo 0) {
        if (!flag) {
            if (q[i] - (i+1) > 2) {
                println("Too chaotic")
                flag = true
            }
            for (j in Math.max(0, q[i] - 2) until i) {
                if (q[j] > q[i]) {
                    count++
                }
            }
        }
    }

    if (!flag)
        println(count)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val q = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        minimumBribes(q)
    }
}
```
