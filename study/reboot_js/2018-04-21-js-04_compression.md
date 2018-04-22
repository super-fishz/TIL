---
layout: post
title: 자바스크립트 스터디 4일차 - 연산자
author: jh
tags: [study, javascript]
---

# Javascript 기본 - 연산자

#### 대입연산자
{% highlight js %}
var a = 1;
// = <- 요게 우항을 조항으로 대입하는 대입연산자임
// 항이 2개 있어서 이항연산자 라고도 함
{% endhighlight %}

#### 동등연산자 (equal operator)
좌항 우항을 비교하여 true, false 를 반환함
{% highlight js %}
==
{% endhighlight %}

#### 일치 연산자 (strict equal operator)
{% highlight js %}
//===사용하기
alert(1=='1');              //true
alert(1==='1');             //false
{% endhighlight %}
=== 을 사용하면 데이터의 값과 형태까지 정확히 일치하는지 비교함

#### 좀 더 예민한 상황
{% highlight js %}
alert(null == undefined);       //true
alert(null === undefined);      //false
alert(true == 1);               //true
alert(true == 2);               //false
alert(true == -1);               //false
alert(true == 0);               //false
alert(true === 1);              //false
alert(true == '1');             //true
alert(true === '1');            //false

alert(0 === -0);                //true
alert(NaN === NaN);             //false
{% endhighlight %}

==, ===, if() 안에서의 차이점을 잘 설명한 테이블 https://dorey.github.io/JavaScript-Equality-Table/
