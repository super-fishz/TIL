# [Breaking the Records](https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem)
## Problem
array 의 최소값, 최대값 조건 비교

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

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    val base = scores[0]
    var minList = mutableListOf(base)
    var maxList = mutableListOf(base)
    
    scores.forEach{ 
        if (it > minList.last())
            minList.add(it)
        if (it < maxList.last())
            maxList.add(it)
    }
    return arrayOf(minList.size - 1, maxList.size - 1)
}



fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}

```
