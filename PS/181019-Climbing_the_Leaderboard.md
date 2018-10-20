# [Climbing the Leaderboard](https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem)

## Problem
두개의 배열을 가지고 효율적으로 삽입하는 

## Solve 1
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

// Complete the climbingLeaderboard function below.
// scores 가 var 인게 맘에 들지는 않음....
data class Game(var scores: MutableList<Int>) {
    var history = mutableListOf<Int>()
    
    fun end(score: Int) {
        val newRankIdx = findScoreIndex(score)
        // println(newRankIdx)
        
        this.scores.add(newRankIdx + 1, score)
        // this.history.add(if (newRankIdx <= 0) 1 else newRankIdx)
        this.history.add(this.scores.distinct().indexOf(score) + 1)
    }
    
    private fun findScoreIndex(score: Int): Int {
        return this.scores.indexOfLast{ it -> it >= score}
    }
}
    
fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
    // scores 는 sorted array(desc)
    // alice 는 sorted arrat(asc)
    
    val game = Game(scores.toMutableList())
    for (score in alice) {
        game.end(score)
    }
    
    return game.history.toTypedArray()
}



fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val scoresCount = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val aliceCount = scan.nextLine().trim().toInt()

    val alice = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = climbingLeaderboard(scores, alice)

    println(result.joinToString("\n"))
}

```
시간초과로 test 6-9 가 통과하지 못함
