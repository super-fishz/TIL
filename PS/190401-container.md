# [그리디 - 배](https://www.acmicpc.net/problem/1092)
## Problem
## Solve
```kotlin
import java.util.Scanner

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    
    val craneCount = sc.nextInt()
    val cranes = ArrayList<Int>()
    for (i in 0 until craneCount) {
        cranes.add(sc.nextInt())
    }
    cranes.sortDescending()
    
    
    val boxCount = sc.nextInt()
    val boxes = ArrayList<Int>()
    for (i in 0 until boxCount) {
        boxes.add(sc.nextInt())
    }
    boxes.sortDescending()
    


    
    if (boxes[0] > cranes[0]) {
        println(-1)
    } else {
        var min = 0
        
        while (boxes.size > 0) {
            for (crane in cranes) {
                val tmp_idx = boxes.indexOfFirst{ it <= crane }
                
                if (tmp_idx > 0) {
                    boxes.removeAt(tmp_idx)
                }
            }
            min++
        }
        
        println(min)
    }
}
```
kotlin 메모리 초과. 그럴 수 있지.
array가 immutable 이라... kotlin으로 풀긴 구리다! 라고 결론짓고... js로 선회

```javascript
var input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

var craneCount = parseInt(input[0]);
var cranes = input[1].split(" ").map(function(v){return parseInt(v)});
cranes.reverse();

var boxCount = parseInt(input[2]);
var boxes = input[3].split(" ").map(function(v){return parseInt(v)});
boxes.reverse();

var min = -1;

if (boxes[0] <= cranes[0]) {
    min = 0;
    while (boxes.length > 0) {
        for (var i in cranes) {
            var crane = cranes[i];
            var tmp_idx = boxes.findIndex(function(it){return it <= crane});

            if (tmp_idx > -1) {
                boxes.splice(tmp_idx, 1);
            }
        }
        min++;
    }
}

console.log(min);
```
는 틀린답... 왜때문에...
