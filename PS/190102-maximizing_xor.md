# [Maximizing XOR](https://www.hackerrank.com/challenges/maximizing-xor/problem)
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

fun maximizingXor(l: Int, r: Int): Int {
    return IntRange(l,r).fold(0) {old, it ->
        IntRange(it, r).fold(old) { _old, _it ->
            val xorResult = it xor _it
            if (_old < xorResult) xorResult else _old
        }
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val l = scan.nextLine().trim().toInt()

    val r = scan.nextLine().trim().toInt()

    val result = maximizingXor(l, r)

    println(result)
}
```
reference : [https://github.com/SeungHwan-Lee/PAD/blob/master/PS/190102-Maximizing_XOR.md](https://github.com/SeungHwan-Lee/PAD/blob/master/PS/190102-Maximizing_XOR.md)
