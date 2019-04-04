# TDD가 하고 싶어요
## [김지훈](https://github.com/super-fishz)

---

# 여러분은 개발을 어떻게 하고 계신가요?

---

# 여러분은 개발을 어떻게 하고 계신가요?
* 회의 갔다 와서
* 기능명세 보고
* 열심히 코딩
* 다되면 전달

---

# 여러분은 개발을 어떻게 하고 계신가요?
* 회의 갔다 와서
* 기능명세 보고
* 열심히 코딩
* **?? 테스트 ??**
* 다되면 전달

---

# 여러분은 개발을 어떻게 하고 계신가요?
* 회의 갔다 와서
* 기능명세 보고
* 열심히 코딩
* **?? 테스트 ??**
  * 이게 TDD 아냐?
* 다되면 전달

---

# 우린 아마 SDD를 하고 있을겁니다.

---

# 우린 아마 SDD를 하고 있을겁니다.
## Self Driven Development

---

# Self Driven Development
* 생각하고, 만들고, 테스트 하고
* 평소에 일하시면서...
* 아마 과제하면서...

---

# Do you know TDD?

---

# TDD
* Test Driven Development<br/>테스트 주도 개발
* “결정과 피드백 사이의 갭에 대한 인식" 간극을 조절하기 위한 테크닉
* 결정 - ‘이렇게 프로그래밍 해야지'
* 피드백 - '이게 되네?' 혹은 '안되네?' 와 같은 피드백

---

# 저는 테스트 코드를 적는데요?
* 테스트 코드를 적는다 != TDD

---

### 테스트 코드를 적는다
# 자동화 테스트

---

### 테스트 코드를 적는다
# 자동화 테스트
## 내가 안하니까 자동임

---

# TDD는 Test 하는 방법이나 종류를 다루지는 않습니다

---

# TDD는 Test 하는 방법이나 종류를 다루지는 않습니다
## 다만, 테스트가 불가결 하기 때문에, 테스트를 하기에 적합한 방법을 배울거에요

---

# TDD 지향점

---

# "clean code that works"

---

# "clean code that works"
## 군더더기 없는 코드

---

# (Short Version) TDD
* red, green, blue

---

# (Short Version) TDD
* fail, success, refactor

---
# (Short Version) TDD
* Red(fail)
  * 해결하려는 문제에 대한 테스트를 만들고, 실행시켜서 Fail을 얻어낸다
* Green(success)
  * 가장 적은 비용으로 테스트를 성공시킨다
* Blue(refactor)

---

![inline](./tdd_flow.gif)

---

# Test Frist Development + Refactor

---

# TDD  지향점 +

---

# TDD  지향점 +
* TDD를 통해 군더더기 없고, 좋은 구조를 만들게 됨
  * 군더더기?
  * 좋은 구조

---

# TDD  지향점 +
  * 군더더기?
    * Test 외의 구현것들
    * e.g. 이런거 만들어 놓으면 쓰지 않을까?
  * 좋은 구조
    * 명확한 책임 분리
    * 관심사의 집중(SRP, OCP)

---

# 자 TDD 를 해봅시다

---

# 자 TDD 를 해봅시다
## 뭐부터 해야 하죠?

---

# TDD
1. 우선 풀고자 하는 문제를 명확히 한다
1. 문제 중 하나를 테스트로 적는다
  * TDD 에서의 테스트는 단위테스트임
1. 테스트를 최소한의 리소스로 성공시킨다
1. 테스트를 부시지 않고 제대로 구현한다

---

# TDD 를 위한 지침

---

# TDD 를 위한 지침
## 테스트 코드를 짤 때 이걸 기억하면서 짜야함

---

# TDD 를 위한 지침
* 무엇을 테스트 할 것인가? (테스트 목적)
* 가능한 작게 작게 테스트 해야함
* 하나하나가 atomic 해야함

---

# TDD 를 위한 지침
* transactional 해야함
* 순서가 없어야 함

---

# TDD를 전파 하기 위한 지침

---

# TDD를 전파 하기 위한 지침
## 혼자하긴 힘듬, 좋은건 같이하자

---

# TDD를 전파 하기 위한 지침
* 나랑 맘이 맞는 사람을 꼭 섭외하자
* CI에 테스트 task를 넣고 공유하자
* 코드 퀄리티에 따른 활동을 공유하자

---

# 다루지 않은 내용

---

# 다루지 않은 내용
* BDD (Behavior Driven Development)
* DDD (Domain Driven Design)

---

# 스터디 하면서 다룰 내용
* 테스트 도구들

---

# 아마도... JUnit
* 4? 5?
* 차이점
  * [https://www.baeldung.com/junit-5-migration](https://www.baeldung.com/junit-5-migration)
  * [https://howtodoinjava.com/junit5/junit-5-vs-junit-4/](https://howtodoinjava.com/junit5/junit-5-vs-junit-4/)
  * [https://howtodoinjava.com/junit5/junit-5-vs-junit-4/](https://howtodoinjava.com/junit5/junit-5-vs-junit-4/)


---

# 끗

---

### 끗 하기 전에

---

# TDD 단점 타임

---

# TDD 가 항상 옳은가?
* 사용하려는 언어와 프레임 워크에 익숙해지는게 먼저
* TDD가 만병통치약이 아니다
* TDD는 오버헤드가 있다.

---

# [TDD is dead. Long live testing.](https://dhh.dk//2014/tdd-is-dead-long-live-testing.html)

---

# TDD 주금.
### 진짜?

---

# [DHH vs Kent Beck (feat, Martin Fowler)](https://plus.google.com/events/ci2g23mk0lh9too9bgbp3rbut0k)
### [정리된 글은 요기에..](http://www.moreagile.net/2014/05/IsTDDdead1.html)

---

# 바쁜 사람들을 위한 논점 요약
![inline](./dhh.png)

---

# 한 번 더 요약
* TDD는 오버헤드가 너무 크다
* TDD가 설계를 망친다
* TDD가 테스트를 망친다 

---

# conclusion
* 오버헤드가 있는 개발방법론이지만,
* 로직을 더 간결하게 짜려고 노력하게 되고,
* 꼼꼼하게 코딩할 수 있
* 코드를 격리 시킬 수 있음
* 100% TDD 를 하지 않아도 된다 (사견)

