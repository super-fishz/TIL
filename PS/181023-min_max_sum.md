# [Min Max Sum](https://www.hackerrank.com/challenges/mini-max-sum/problem)
## Problem
5개의 Int Array가 주어지고, 4개를 뽑아 더하는데, 최소값과, 최대값을 구하시오.

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

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {
    println("${arr.sum() - arr.max()!!} ${arr.sum() - arr.min()!!}")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}
```
Array 의 배열 사이즈가 5로 고정임. 문제를 이해했는지 보는 문제인듯.
