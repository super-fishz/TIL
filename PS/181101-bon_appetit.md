# [Bon Appetit](https://www.hackerrank.com/challenges/bon-appetit/problem)
## Problem
array 탐색시, 특정 인덱스를 건너뜀

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

// Complete the bonAppetit function below.
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    val sum = bill.filterIndexed{ idx, it -> idx != k }.toTypedArray().sum()
    
    println(if ((sum / 2) == b) "Bon Appetit" else bill[k]/2)
}

fun main(args: Array<String>) {
    val nk = readLine()!!.trimEnd().split(" ")

    val n = nk[0].toInt()

    val k = nk[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}
```
