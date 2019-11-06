# [TypeScript in 5 minutes](https://www.typescriptlang.org/docs/handbook)

## install
```bash
npm install -g typescript
```

## codes
### First - write ts code like js code
```ts
function greeter(person) {
    return "Hello, " + person;
}

let user = "Jane User";

console.log(greeter(user));
```
then, compile
```bash
tsc greeter.ts
```

### Second - add Type annotation
```ts
function greeter(person: string) {
    return "Hello, " + person;
}

let user = [0, 1, 2];

console.log(greeter(user));
```
some error return
```bash
# error TS2345: Argument of type 'number[]' is not assignable to parameter of type 'string'.
```

### Thrid - Interface
```ts
interface Person {
    firstName: string;
    lastName: string;
}

function greeter(person: Person) {
    return "Hello, " + person.firstName + " " + person.lastName;
}

let user = { firstName: "Jane", lastName: "User" };

console.log(greeter(user));
```

### Fourth
```ts
class Student {
    fullName: string;
    constructor(public firstName: string, public middleInitial: string, public lastName: string) {
        this.fullName = firstName + " " + middleInitial + " " + lastName;
    }
}

interface Person {
    firstName: string;
    lastName: string;
}

function greeter(person: Person) {
    return "Hello, " + person.firstName + " " + person.lastName;
}

let user = new Student("Jane", "M.", "User");

console.log(greeter(user));
```
