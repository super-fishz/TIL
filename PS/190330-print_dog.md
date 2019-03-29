# [Print Dog](https://www.acmicpc.net/problem/10172)
## Problem
그냥 개 모양을 그대로 출력하면 됨

## Solve
```kotlin
fun main() {
    val dog = """|\_/|
                #|q p|   /}
                #( 0 )""'\
                #|"^"`    |
                #||_/=\\__|""".trimMargin("#").replace('\'','"')
    
    println(dog)
}
```
kotlin [raw string](https://kotlinlang.org/docs/reference/basic-types.html)의 시작이 """인데 하필 컨텐츠 안에 """이 있다.
'는 안쓰여서 replace 꼼수로....
