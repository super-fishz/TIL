# [ACM ICPC Team](https://www.hackerrank.com/challenges/acm-icpc-team/problem)
## Problem
주어진 스트링을 or조건으로 겹쳐서 count를 세기

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

// Complete the acmTeam function below.
fun acmTeam(topic: Array<String>): Array<Int> {
    var max = 0
    var count = 0

    topic.forEachIndexed { index, it ->
        for(j in (index+1)..(topic.size-1)) {
            val _max = topicCount(it, topic[j])

            if (max == _max) {
                count++
            } else if (max < _max) {
                max = _max
                count = 1
            }
        }
    }

    return arrayOf(max, count)
}

fun topicCount(str: String, str2: String): Int {
    return str.filterIndexed { index, it ->
        if (it == '1' || str2[index] == '1') {
            true
        } else {
            false
        }
    }.length ?: 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val topic = Array<String>(n, { "" })
    for (i in 0 until n) {
        val topicItem = scan.nextLine()
        topic[i] = topicItem
    }

    val result = acmTeam(topic)

    println(result.joinToString("\n"))
}
```
