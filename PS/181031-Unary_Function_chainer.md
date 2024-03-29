# [Unary function chainer](https://www.codewars.com/kata/unary-function-chainer/train/javascript) 
## Problem
Your task is to write a higher order function for chaining together a list of unary functions. In other words, it should return a function that does a left fold on the given functions.
```
chained([a,b,c,d])(input)
```
Should yield the same result as
```
d(c(b(a(input))))
```
## Solve
```javascript
function chained(functions) {
  return input => functions.reduce((res, func) => func(res), input);
}

// test
function f1(x){ return x*2 }
function f2(x){ return x+2 }
function f3(x){ return Math.pow(x,2) }

function f4(x){ return x.split("").concat().reverse().join("").split(" ")}
function f5(xs){ return xs.concat().reverse() }
function f6(xs){ return xs.join("_") }

Test.assertEquals( chained([f1,f2,f3])(0), 4 )
Test.assertEquals( chained([f1,f2,f3])(2), 36 )
Test.assertEquals( chained([f3,f2,f1])(2), 12 )

Test.assertEquals(chained([f4,f5,f6])("lorem ipsum"), "merol_muspi")
```
