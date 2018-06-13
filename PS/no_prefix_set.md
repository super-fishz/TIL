## Problem
https://www.hackerrank.com/challenges/no-prefix-set/problem


## ~solution~

테스트 일부가 실패한다...
```kotlin
import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val scan = Scanner(System.`in`)

    val stringsCount = scan.nextLine().trim().toInt()
    val strings = Array<String>(stringsCount, { "" })
    for (i in 0 until stringsCount) {
        val stringsItem = scan.nextLine()
        strings[i] = stringsItem
    }
    
    evaluate(strings)
}

fun evaluate(strings: Array<String>) {
    val result = mutableSetOf<Int>()
    strings.forEach { s1->
        strings.filter { s2 ->
            s2 != s1
        }.find { s2 ->
            s2.startsWith(s1)
        }?.let {
            result.add(strings.indexOf(it))
        }
    }
    
    if (result.isNotEmpty()) {
        println("BAD SET")
        println(strings.get(result.sorted().first()))
    } else {
        println("GOOD SET")
    }
}
```
