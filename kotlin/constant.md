# kotlin constant

코틀린에서 컴파일 타임에 상수라는 것을 게런티 받으려면 아래 세 조건을 만족해야 한다. [document](https://kotlinlang.org/docs/reference/properties.html#compile-time-constants)

```
Top-level or member of an object
Initialized with a value of type String or a primitive type
No custom getter
```
