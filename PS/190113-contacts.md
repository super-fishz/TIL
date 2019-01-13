# [Contacts](https://www.hackerrank.com/challenges/contacts/problem)
## Problem
Trie Node 를 사용해서 푸는게 효율적인 문제. 재귀나 기타 방법으로 풀이가능함
## Solve
```kotlin
import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

class Node (
        var count: Int,
        val children: Array<Node?>
) {

    companion object {
        @JvmStatic
        fun create(): Node = Node(0, arrayOfNulls(26))
    }
}

fun contacts(queries: Array<Array<String>>): Array<Int> {
    val node = Node.create()
    val result = mutableListOf<Int>()
    queries.forEach {
        if (it[0] == "add") {
            add(node, it[1])
        } else {
            result.add(find(node, it[1]))
        }
    }

    return result.toTypedArray()
}

fun add(root: Node, query: String) {
    var currentNode = root

    query.forEach {
        val index = it.toInt() - 'a'.toInt()
        if (currentNode.children[index] == null) {
            currentNode.children[index] = Node.create()
        }

        currentNode.children[index]!!.count++
        currentNode = currentNode.children[index]!!
    }
}

fun find(root: Node, query: String): Int {
    var currentNode = root
    var result = 0

    query.forEach {
        val index = it.toInt() - 'a'.toInt()
        if (currentNode.children[index] != null) {
            result = currentNode.children[index]!!.count
            currentNode = currentNode.children[index]!!
        } else {
            result = 0
            return@forEach
        }
    }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val queriesRows = scan.nextLine().trim().toInt()

    val queries = Array<Array<String>>(queriesRows, { Array<String>(2, { "" }) })

    for (queriesRowItr in 0 until queriesRows) {
        queries[queriesRowItr] = scan.nextLine().split(" ").toTypedArray()
    }

    val result = contacts(queries)

    println(result.joinToString("\n"))
}
```
