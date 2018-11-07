# [Jumping on the Clouds](https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup)
## Problem
배열의 포인터를 두고 탐색하는 문제
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

fun jumpingOnClouds(c: Array<Int>): Int {
    var count = 0
    var i = 0
    
    while (i <c.size-1) {
        count++
        // prepare 2step jump
        if (i+1 == c.size - 1 || i+2 == c.size - 1) {
            break
        } else if (c[i+2] == 0) {
            i = i + 2
            // 1 step
        } else {
            i = i + 1
            // 2 step
        }
    }

    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}
```
Time Complexity(n)
Space Complexity(2)
