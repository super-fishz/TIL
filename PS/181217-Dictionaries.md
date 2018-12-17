# [Dictionaries and maps](https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem)
## Problem
## Solve
```javascript
function processData(input) {
    const [num,..._input] = input.split("\n");
    const address = new Map();

     _input.slice(0, num).map(function (it) {
        const [name, number] = it.split(" ");
        address.set(name, number);
    })

    _input.slice(num, _input.length).forEach(function (it) {
        if (address.get(it)) {
            console.log(`${it}=${address.get(it)}`)
        } else {
            console.log("Not found")
        }
    });
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
```
