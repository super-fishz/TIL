# [Balanced Brackets](https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues)
## Problem
## Solve
```javascript
'use strict';

const fs = require('fs');

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

// Complete the isBalanced function below.
function isBalanced(s) {
    let result = 'YES';
    const stack = [];
    s.split('').forEach(function (val) {
        switch (val) {
            case '{':
                stack.push('}');
                break;
            case '[':
                stack.push(']');
                break;
            case '(':
                stack.push(')');
                break;
            default:
                var test = stack.pop();
                if (val !== test) {
                    result = 'NO';
                }
        }
    })
    if (stack.length) {
        result = 'NO';
    }
    return result;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const t = parseInt(readLine(), 10);

    for (let tItr = 0; tItr < t; tItr++) {
        const s = readLine();

        let result = isBalanced(s);

        ws.write(result + "\n");
    }

    ws.end();
}

```
