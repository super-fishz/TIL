# [transactional annotation - propagation](https://docs.spring.io/spring/docs/4.2.x/spring-framework-reference/html/transaction.html#tx-propagation)
* spring 에서 @transactional을 사용해 class 나 method 를 transactional하게 만들 수 있다
* 그 중 propagation은 transaction을 전파시키는데 어떤 전략으로 전파시킬지에 대한 옵션이다
    * (default) REQUIRED : 부모 트랜잭션 내에서 실행하며 부모 트랜잭션이 없을 경우 새로운 트랜잭션을 생성
    * REQUIRES_NEW : 부모 트랜잭션을 무시하고 무조건 새로운 트랜잭션이 생성
    * SUPPORT : 부모 트랜잭션 내에서 실행하며 부모 트랜잭션이 없을 경우 nontransactionally로 실행
    * MANDATORY : 부모 트랜잭션 내에서 실행되며 부모 트랜잭션이 없을 경우 예외가 발생
    * NOT_SUPPORT : nontransactionally로 실행하며 부모 트랜잭션 내에서 실행될 경우 일시 정지
    * NEVER : nontransactionally로 실행되며 부모 트랜잭션이 존재한다면 예외가 발생
    * NESTED : 해당 메서드가 부모 트랜잭션에서 진행될 경우 별개로 커밋되거나 롤백될 수 있음. 둘러싼 트랜잭션이 없을 경우 REQUIRED와 동일하게 작동
    * [reference](https://taetaetae.github.io/2016/10/08/20161008/)

## 문제점
* transaction 내에서 다른 위성시스템을 호출하고,
* 호출한 결과값이 다른 스레드를 통해서 저장되는데,
* 아직 트렌젝션이 끝나지 않은상태였다.
* 사실 트랜젝션은 끝났는데, 해당 트랜젝션이 끝나기 전에 다른 트랜젝션이 시작되었고
* 기존 트랜젝션을 그대로 이어받아서(default) 트랜젝션이 유지되어버렸다
* 결과적으로 위성시스템의 결과를 저장하지 못한 셈

## 해결
* 적절한 타이밍에 트렌젝션이 끊길 수 있도록 propagation을 REQUIRES_NEW 로 조정하였음
