# [Cat years, Dog years](https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b)
## Problem
```
Kata Task
I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that
```
## Solve
```kotlin
package solution

fun calculateYears(years: Int): Array<Int> {
    years
    return arrayOf(years, catYear(years), dogYear(years));
}

fun catYear(years: Int): Int {
  return when(years) {
    0 -> 0
    1 -> 15
    2 -> 24
    else -> 24 + 4 * (years - 2)
  }
}
fun dogYear(years: Int): Int {
  return when(years) {
    0 -> 0
    1 -> 15
    2 -> 24
    else -> 24 + 5 * (years - 2)
  }
}
```
