# [Grading](https://www.hackerrank.com/challenges/grading/problem)
## Problem
38 이상의 숫자중에 5의 배수의 차가 3보다 작게나면 5의 배수값으로 만들어줌

## Solve
```kotlin
import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the gradingStudents function below.
 */
fun gradingStudents(grades: Array<Int>): Array<Int> {
    return grades.map{it -> fixGrade(it)}.toTypedArray()
}

fun fixGrade(grade: Int): Int {
    val step = 5
    val nextGrade = ((grade / step) + 1) * step
    
    return if (nextGrade - grade < 3 && grade >= 38) { nextGrade  } else { grade }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val grades = Array<Int>(n, { 0 })
    for (gradesItr in 0 until n) {
        val gradesItem = scan.nextLine().trim().toInt()
        grades[gradesItr] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}

```
