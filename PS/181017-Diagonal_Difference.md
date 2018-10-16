# [Diagonal Difference](https://www.hackerrank.com/challenges/diagonal-difference/problem)

## Problem
주어진 배열의 대각선 값의 합을 구한 다음, 각 합의 차를 절대값으로 

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

// Complete the diagonalDifference function below.
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // arr 이 3x3 일때,
    // [0,2], [1,1], [2,0]
    // [0,0], [1,1], [2,2]
    // 형태의 값들을 sum 하고 차를 절대값으로 반환
    
    val squareSize = arr.size
    
    val leftToRight = leftToRight(arr)
    val rightToLeft = rightToLeft(arr)
    
    return if (leftToRight > rightToLeft) leftToRight - rightToLeft else rightToLeft - leftToRight
}

// 얘들 condition만 빼고 중복인데....
fun leftToRight(arr: Array<Array<Int>>): Int {
    var i = 0
    var sum = 0
    
    for (i in 0 until arr.size) {
        var j = 0
        for (j in 0 until arr[i].size) {
            if (i+j == arr.size - 1) {
                sum += arr[i][j]
            }
        }
    }
    return sum
}

fun rightToLeft(arr: Array<Array<Int>>): Int {
    var i = 0
    var sum = 0
    
    for (i in 0 until arr.size) {
        var j = 0
        for (j in 0 until arr[i].size) {
            if (i==j) {
                sum += arr[i][j]
            }
        }
    }
    return sum
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}

```
코틀린 컴파일러가 좀 옛날꺼인듯...
