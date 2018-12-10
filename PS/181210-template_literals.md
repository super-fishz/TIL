# [Template Literals]()
## Problem
Tagged Template Literal 을 완성하면 됨 [link](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Template_literals#Tagged_templates)
## Solve
```javascript
/*
 * Determine the original side lengths and return an array:
 * - The first element is the length of the shorter side
 * - The second element is the length of the longer side
 * 
 * Parameter(s):
 * literals: The tagged template literal's array of strings.
 * expressions: The tagged template literal's array of expression values (i.e., [area, perimeter]).
 */
function sides(literals, ...expressions) {
    const [a, p] = expressions;

    const root = Math.sqrt((p * p) - (16 * a))
    const s1 = (p + root) / 4;
    const s2 = (p - root) / 4;

    return ([s2, s1]);
}

function main() {
    let s1 = +(readLine());
    let s2 = +(readLine());
    
    [s1, s2] = [s1, s2].sort();
    
    const [x, y] = sides`The area is: ${s1 * s2}.\nThe perimeter is: ${2 * (s1 + s2)}.`;
    
    console.log((s1 === x) ? s1 : -1);
    console.log((s2 === y) ? s2 : -1);
}
```
Tagged Templates 처음 써봄...
