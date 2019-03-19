# Structure and Interpretation of Computer Programs
## 프로시저를 써서 요약하는 방법
### 연습 : 뉴튼 법newton method으로 제곱근 찾기
* 문제에 대한 해답을 수식으로 표현하고,
* 표현한 수식을 scheme 함수 형태로 정리한다
```scheme
(define (average x y)
  (/ (+ x y) 2))
(define (square x)
  (* x x))


(define (sqrt x)
  (define (good-enough? guess)
      (< (abs (- (square guess) x)) 0.001))
    (define (improve guess)
        (average guess (/ x guess)))
      (define (sqrt-iter guess)
          (if (good-enough? guess)
                guess
                      (sqrt-iter (improve guess))))
        (sqrt-iter 1.0))

(sqrt 2)
;; 1.4142156862745097
;; 사실 아랫단원에서 말하는 블랙박스에서 이야기하는 것처럼 scope을 정리했다
;; exercise 1.7 같은건 https://github.com/danielmiladinov/sicp-scheme/blob/master/exercise-1.7.scm
;; 을 참조
```

### 블랙박스처럼 간추린 프로시저
* 변수와 상수의 유효범위에 대한 이야기를 했다.
* 당연하게 받아들이지만, 당연하지 않을 수 있는 부분.
* free variable, bound variable, scope, name-package, block structure

## 프로시저와 프로세스
### 되돌거나recursion 반복하는iteration 프로세스
* 어떤 형태로 문제를 풀어나갈지에 대한 부분
* recursive 하게 풀 것인지
* iterative 하게 풀 것인지
* factorial 함수를 구현하면서 예시를 들었다

### 여러 갈래로 되도는 프로세스
* fibonachi 를
    * iterative 하게 구현했을 때와
    * recursive 하게 구현했을 때
* 함수의 전개되는 양상을 통해 자원을 얼마나 쓰는지 파악해봄

### 프로세스가 자라나는 정도
* 자라나는 정도order of growth
    * big theta notation으로 표기했다.
        * [점근적 표기법](https://github.com/monkeys-code/save-the-monkey/blob/master/slides/190202-complexity.pdf)

### 거듭제곱
* n^1000을 할때
    * Θ(n), Θ(log n)
    * 반복횟수 1000 vs 14
