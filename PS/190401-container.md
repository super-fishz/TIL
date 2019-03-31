# [그리디 - 배]()
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
        
        // while (boxes.size > 0) {
        for (i in 0 until boxes.size) {
            boxes.removeAt(i)
            // crane 마다 포인터 두고 거기부터 desending 해가면 될 것 같은디...
        }
        
        println(min)
    }
}
```
푸는중...
