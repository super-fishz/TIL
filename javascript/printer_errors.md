### Problem
https://www.codewars.com/kata/printer-errors/train/javascript



### solution
```javascript
function printerError(s) {
  let err = 0
  s.split('').forEach(function(it) {
    if (!/[a-m]/.test(it)) err++
  })
  
  return `${err}/${s.length}`
}

// test
Test.describe("printerError",function() {
Test.it("Basic tests",function() {   
    var s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"
    Test.assertEquals(printerError(s), "3/56")
})})
```
