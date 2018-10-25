# [time-conversion](https://www.hackerrank.com/challenges/time-conversion/problem)
## Problem
12시 표기법을 24시 표기법으로 바꾸시오

## Solve
```kotlin
import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    return if ((s.endsWith("AM") && !s.startsWith("12")) 
               || (s.endsWith("PM") && s.startsWith("12"))) s.slice(IntRange(0,7)) else {
        var hour =  s.slice(IntRange(0,1)).toInt() + 12
        if (hour == 24) {
            hour = 0
        }
        val rest = s.slice(IntRange(2,7))
        hour.toString().padStart(2,'0') + rest
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}

```
AM12시가 낮인줄 알았다....
