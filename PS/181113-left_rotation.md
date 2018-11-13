# [Left Rotation](https://www.hackerrank.com/challenges/array-left-rotation/problem)
## Problem
array 를 좌측으로 한칸씩 움직이는 문제.
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


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    leftRotation(a, d)
}

fun leftRotation(_arr:Array<Int>, time:Int) {
    val arr = _arr.toMutableList()
    for (i in 0 until time) {
        arr.add(arr.removeAt(0))
    }
    println(arr.joinToString(" "))
}
```
array 가 이뮤터블이라... 음.... 구조를 안바꾸고 쓸 수 있으려나...
