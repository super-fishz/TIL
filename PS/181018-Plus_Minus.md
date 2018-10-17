# [Plus Minus](https://www.hackerrank.com/challenges/plus-minus/problem)
## Problem
주어진 배열에서 양수, 음수, 정수의 값의 비율을 소수점 6자리로 반환하기

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

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    var positive = 0
    var negative = 0
    var zero = 0
    
    for (item in arr) {
        when {
            item > 0 -> positive++
            item < 0 -> negative++
            else -> zero++
        }
    }
    
    println(positive.toDecimal(arr.size).accuracy(6))
    println(negative.toDecimal(arr.size).accuracy(6))
    println(zero.toDecimal(arr.size).accuracy(6))
}

fun Int.toDecimal(arrSize: Int): Double = this/arrSize.toDouble()
fun Double.accuracy(accuracy: Int): String = String.format("%.${accuracy}f", this)

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
```
쉬운 문제라 시간복잡도를 늘리지 않는 방향으로, `O(n)`
