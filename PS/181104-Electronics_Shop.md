# [Electronics Shop](https://www.hackerrank.com/challenges/electronics-shop/problem)
## Problem
array 두개의 값을 더해서, 조건 내의 최대값을 찾기.
## Solve
```kotlin
import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    var sums = mutableSetOf<Int>()
    for (keyboard in keyboards) {
        for (drive in drives) {
            if (drive + keyboard <= b) {
                sums.add(keyboard + drive)
            }
        }
    }
    return sums.maxBy{it} ?: -1
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val bnm = scan.nextLine().split(" ")

    val b = bnm[0].trim().toInt()

    val n = bnm[1].trim().toInt()

    val m = bnm[2].trim().toInt()

    val keyboards = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val drives = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    /*
     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
     */

    val moneySpent = getMoneySpent(keyboards, drives, b)

    println(moneySpent)
}
```
키보드의 수 n, usb 드라이브의 수 m
Time Complexity : O(nm)
Space Complexity : O(nm)

이거 다시 풀어야 할 듯..
