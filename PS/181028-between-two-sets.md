# [between two sets](https://www.hackerrank.com/challenges/between-two-sets/problem)
## Problem
문제가 꽤 긴데, lcm, gcd 구하는 문제였음.

## Solve
```kotlin
import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the getTotalX function below.
 */
fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    /*
     * Write your code here.
     */
    // 말이 어려운데, a의 최소공배수의 n배 한 것으로 b를 나눌 수 있는 수 c 의 개수를 구하시오 같다.
    // val lcm = lcm(a[0],a[1])
    val lcm = if (a.size == 1) a[0] else a.reduce{a0, a1 -> lcm(a0, a1) }
    var count = 0
    var factor = 1
    
    while(true) {
        val div = lcm * factor
        // count 
        if (b.filter{it -> it % div == 0}.size == b.size) {
            count++
        }
        
        // exit condition
        if (b.max()!! <= div) {
            break
        }
        factor++
    }
    return count
}

fun lcm(a:Int, b:Int): Int {
    return a*b/gcd(a,b)
}

fun gcd(a:Int, b:Int): Int {
    return if (a%b == 0) {
        b
    } else {
        gcd(b, a%b)
    }
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val b = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val total = getTotalX(a, b)

    println(total)
}

```
