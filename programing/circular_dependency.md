# 상호 순환 참조
많은 언어에서 상호 참조는 안티 패턴으로 인식된다. 참조를 한다는 뜻은 클래스(구현체, 모듈, 기타 등등) 하나를 설명하기 위해서는 다른 클래스의 도움을 받아야 한다는 것이다.

* Class A가 B를 의존하고, Class B가 A를 의존하는 경우.
* Class A가 B를 의존하고, Class B가 C를 의존하고, Class C가 다시 A를 의존하는 경우.

즉 의존 관계도를 그릴 때, loop 가 이뤄진 경우를 말한다. 프로젝트가 작을 때는 쉽게 파악이 되지만, 이해 관계자들도 떠나고, 프로젝트가 커져 의존관계가 큰 원을 그리는 경우 (A -> B -> C -> D -> E -> A)는 논리적으로 발견하기 힘들어진다.
{% highlight java %}
class A {
    B b;
}
class B {
    A a;
}
//

class A {
    B b;
}
class B {
    C c;
}
class C {
    A a;
}
{% endhighlight %}


## 왜 안 좋은가?
패키지 내부에서의 상호의존은 경우에 따라 허용해야 할 수도 있지만 범용적인 예를 다뤄보자. 상호 의존을 하게 되면 의존을 하는 클래스들끼리 강한 결합을 하게 된다. A가 변했을 때, 죄 없는 B도 같이 변해야 할 필요성이 있다는 것이다. 강한 결합은 의도하지 않은 부수효과를 발생하고 결국 전체적인 질이 하락하게 된다. 정원에 난 잡초 하나를 뽑지 않고 놔두면, 잡초는 무럭무럭 옆으로 자라난다.
개발자는 자신이 관리하는 코드를 깨끗하고 명료하게 관리해야 할 책임이 있다.
 
## 어떻게 파훼해야 하는가?
대부분의 문제는 파인만 알고리즘으로 풀 수 있다.
![feynman_algorithm]({{site.url}}/public/posts_images/feynman_algorithm.jpg)

1. 문제를 쓴다.
2. 매우 깊게 생각한다.
3. 답을 쓴다.

Class A가 B를 참조해야 하는 이유를 골똘히 생각해보자. 왜 참조하고 있는가?
그리고 Class B가 A를 참조해야 하는 이유를 골돌히 생각해보자. 왜 참조하고 있는가?

의존성의 방향을 한쪽 방향으로 바꿔줄 필요가 있다. 의존성의 방향을 한쪽으로만 통제하면 변경에 영향을 받는 부분을 명확하게 이해할 수 있어진다.

혹은 A와 B를 모두 알고 있는 Class C를 만들어서 A와 B에서 의존적으로 하는 일을 위임받아서 하는 방법도 있다.

간혹 언어의 특성을 이용해서 문제를 잠시 회피하는 방법도 있다. (C++ 에서 포인터를 사용한다거나, 모듈을 하나씩 빌드한다거나.)

## 더 읽어보면 좋을 것들
* [toby - Code Organization & Cyclic Dependency Problem](http://toby.epril.com/?p=263)
* [Breaking Dependency Cycles](https://dzone.com/articles/breaking-dependency-cycles)
* [같은 글을 블로그에도 발행해놨다.](http://hyper-cube.io/2018/03/30/circular_dependency/)
