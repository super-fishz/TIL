# [Drawing Book](https://www.hackerrank.com/challenges/drawing-book/problem)
## Problem
문제에 대한 이해를 묻는 문제.
## Solve
```kotlin
import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*
     
fun pageCount(n: Int, p: Int): Int = Math.min(p/2, n/2 - p/2)

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().trim().toInt()

    val result = pageCount(n, p)

    println(result)
}
```
Time Complexity: O(1)
Space Complexity: O(1)
