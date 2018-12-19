# [Day 10: Binary Numbers](https://www.hackerrank.com/challenges/30-binary-numbers/problem)
## Problem
## Solve
```javascript

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}



function main() {
    const n = parseInt(readLine(), 10);
    console.log(binaryNumber(n));
}

function binaryNumber(n) {
    return Math.max(...n.toString(2).split("0").filter(it => it.length > 0)).toString().length
}
```
