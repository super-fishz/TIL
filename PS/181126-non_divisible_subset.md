# [Non Divisible Subset](https://www.hackerrank.com/challenges/non-divisible-subset/problem)
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

// Complete the nonDivisibleSubset function below.
fun nonDivisibleSubset(k: Int, S: Array<Int>): Int {
    // make subset
    var resultSet = mutableSetOf<Int>()
    val subset = S.flatMap {
        S.filterIndexed { index, _ ->
            index > S.indexOf(it)
        }.map { it2 ->
            if ((it + it2) % k != 0) {
                resultSet.add(it)
                resultSet.add(it2)
            }
            it + it2
        }
    }.toSet()
    // .filter { it % k != 0 } // divisible?
    println(subset)
    // subset to items
    // return
    println(resultSet)

    return resultSet.size
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val S = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = nonDivisibleSubset(k, S)

    println(result)
}
```
imutable 로 풀려다가 잘 안풀어서 mutable 넣는중...
