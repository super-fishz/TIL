# [Print the Elements of a linked list](https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem)
## Problem
링크드 리스트 자료형이 무엇인지 알고 있는지 묻는 문제
## Solve
```javascript
function printLinkedList(head) {
    console.log(head.data)
    if (head.next)
        printLinkedList(head.next)
}
```
