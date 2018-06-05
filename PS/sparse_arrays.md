# Problem
https://www.hackerrank.com/challenges/sparse-arrays/problem
```
Given a collection of input strings of length N and a collection of query strings of length Q,
return the collection of integers that is consist of occurrences of each query strings.
```

# Solution
string(S)에 대하여 query(Q)를 각 s에 대하여 반복하므로 시간복잡도는 O(SQ),<br/>
루프를 한번만 돌면서 빈도를 계산하면 시간복잡도는 줄어들텐데(O(S+Q))<br/>
직관적으로 한줄로 풀었음.
### Kotlin
```kotlin
fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    return queries.map{q -> strings.count{s -> q == s}}.toTypedArray()
}
```
다른 언어로 푼 풀이 https://github.com/aria-grande/TIL/commit/102c880dcd2d030a21dc03f38a502eb2456365dc
