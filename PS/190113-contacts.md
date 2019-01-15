# [Contacts](https://www.hackerrank.com/challenges/contacts/problem)
## Problem
Trie Node 를 사용해서 푸는게 효율적인 문제. 재귀나 기타 방법으로 풀이가능함
## Solve
```kotlin

private val Char.index: Int
    get() = this - 'a'

class TrieNode {
    val children = arrayOfNulls<TrieNode?>(26)
    var cnt = 0

    fun add(c: Char): TrieNode {
        if (children[c.index] == null) children[c.index] = TrieNode()
        children[c.index]!!.cnt++
        return children[c.index]!!
    }

    fun find(c: Char) = children[c.index] ?: TrieNode()
}

class Trie {
    private val root = TrieNode()

    fun add(s: String) {
        var currentNode = root
        s.forEach { currentNode = currentNode.add(it) }
    }

    fun find(s: String): Int {
        var currentNode = root
        
        s.forEach {
            currentNode = currentNode.find(it)
        }
        
        return currentNode.cnt
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val root = Trie()
    
    for (i in 1..n) {
        val (op, s) = readLine()!!.split(" ")
        when (op) {
            "add"  -> root.add(s)
            "find" -> println(root.find(s))
        }
    }
}
```
