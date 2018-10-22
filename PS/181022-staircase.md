# [Staircase](https://www.hackerrank.com/challenges/staircase/problem)
## problem
6을 입력 받으면
```
     #
    ##
   ###
  ####
 #####
######
```
로 계단 모양을 출력하면 됨

## solve
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

// Complete the staircase function below.
fun staircase(n: Int): Unit {
    val sharp = "#"
    val space = " "
    
    for (row in 1..n ) {
        println(space.repeat(n - row) + sharp.repeat(row))
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}

```
