# [acmicpc-1931 회의실 배정](https://www.acmicpc.net/problem/1931)
## Problem
수요일에 배운 그리디 알고리즘의 기초적인 예

## Solve
```kotlin
import java.util.Scanner

data class Meeting(val start: Int, val end: Int)

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    val length = sc.nextInt()

    val meetings = ArrayList<Meeting>()
    for (i in 0 until length) {
        meetings.add(Meeting(sc.nextInt(), sc.nextInt()))
    }
    
    var currentMeeting = 0
    var count = 0
    meetings
        .sortedWith(compareBy({ it.start }))
        .sortedWith(compareBy{ it.end })
        .forEach {
            if (currentMeeting <= it.start) {
           		currentMeeting = it.end
                count++
            }
        }
        
    println(count)
}
```
base 코드 맨날 짜주는 데서 풀다가, scanner input 부터 받아야 해서 당황했당.
