# [Minimum Swap](https://www.hackerrank.com/challenges/minimum-swaps-2/problem)
## Problem
1..ㅜn 까지 있는 배열을 순서대로 정렬하는데 최소한으로 움직여서 정렬한다.

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

fun minimumSwaps(arr: Array<Int>): Int {
    var count = 0

    arr.forEachIndexed { index, i ->
        while (arr[index] != index + 1) {
            if (arr[index] != index + 1) {
                arr.swap(index, arr[index] - 1)
                count++
            }
        }
    }    
    return count
}
private fun <T> Array<T>.swap(i: Int, j: Int) {
    val tmp = this[i]
    this[i] = this[j]
    this[j] = tmp
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val res = minimumSwaps(arr)

    println(res)
}
```
배열의 크기를 n이라고 했을때
Time Complexity : worst case, O(n^2) / best case O(n)
Space Complexity : O(n + 1)
