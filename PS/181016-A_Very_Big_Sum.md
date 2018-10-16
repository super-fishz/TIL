# [A Very Big Sum](https://www.hackerrank.com/challenges/a-very-big-sum/problem)

## Problem
주어진 숫자(꽤 큼)들을 모두 더함.

```kotlin
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}
```

## Solve
사실 kotlin은 array 에 sum 함수가 있어서...
```kotlin
fun aVeryBigSum(ar: Array<Long>): Long = ar.sum()
```
