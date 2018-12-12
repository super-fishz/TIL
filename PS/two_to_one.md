## problem
https://www.codewars.com/kata/two-to-one/train/kotlin


## solution
kotlin
```kotlin
fun longest(s1:String, s2:String):String {
    return (s1 + s2).toSortedSet().joinToString("")
}
```
javascript
```javascript
function longest(s1, s2) {
  return [...s1+s2].filter((v, i, s) => s.indexOf(v) == i).sort().join('')
}
```


## test
kotlin
```kotlin
package twotoone

import org.junit.Assert.*
import java.util.Arrays
import org.junit.Test

class TwoToOneTest {
  @Test
  fun test() {
    println("longest Fixed Tests")
    assertEquals("aehrsty", longest("aretheyhere", "yestheyarehere"))
    assertEquals("abcdefghilnoprstu", longest("loopingisfunbutdangerous", "lessdangerousthancoding"))
    assertEquals("acefghilmnoprstuy", longest("inmanylanguages", "theresapairoffunctions"))
    
  }
  
}
```
javascript
```javascript
Test.describe("longest",function() {
Test.it("Basic tests",function() {
    Test.assertEquals(longest("aretheyhere", "yestheyarehere"), "aehrsty")
    Test.assertEquals(longest("loopingisfunbutdangerous", "lessdangerousthancoding"), "abcdefghilnoprstu")
    Test.assertEquals(longest("inmanylanguages", "theresapairoffunctions"), "acefghilmnoprstuy")
})})
```
