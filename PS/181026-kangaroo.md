# [Kangaroo](https://www.hackerrank.com/challenges/kangaroo/problem)
## Problem
다른 속도로 점핑하는 캥거루 두마리가 만나는가?


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

// Complete the kangaroo function below.
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    return if (areTheyMeet(x1, v1, x2, v2)) "YES" else "NO"
}
fun areTheyMeet(x1: Int, v1: Int, x2: Int, v2: Int): Boolean {
    var _x1 = x1
    var _x2 = x2
    
    while(true) {
        if (_x1 == _x2) {
            return true
        } else if (_x1 > _x2) {
            return false
        }

        _x1 = _x1.jump(v1)
        _x2 = _x2.jump(v2)
    }
}
fun Int.jump(v:Int): Int = this + v


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x1V1X2V2 = scan.nextLine().split(" ")

    val x1 = x1V1X2V2[0].trim().toInt()

    val v1 = x1V1X2V2[1].trim().toInt()

    val x2 = x1V1X2V2[2].trim().toInt()

    val v2 = x1V1X2V2[3].trim().toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
```
최소 공배수를 구하는 문제 변형
