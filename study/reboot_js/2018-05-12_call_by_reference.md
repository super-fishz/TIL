---
layout: post
title: 자바스크립트 스터디 25일차 - 참조
author: jh
tags: [study, javascript]
---
# 참조
## 복제
{% highlight js %}
let a = '123';
let b = a;
b = '456';
console.log(a); // 123
console.log(b); // 456
{% endhighlight %}

## 참조
{% highlight js %}
let a = {'id': 1};
let b = a;
b.id = 2;
console.log(a.id); // 2
console.log(b.id); // 2
{% endhighlight %}

원시 데이터 타입은 대입하면 복제되지만, 그렇지 않은 것들은 참조로 동작함.
* primitive
    * Number
    * Boolean
    * null
    * undefined

{% highlight js %}
const a = {'id': 1};
function func1(b) {
    b = {'id': 2};
}
func1(a);
console.log(a.id); // 2

const a = {'id': 1};
function func2(b) {
    b.id = 2;
}

func2(a);
console.log(a.id); // 2
{% endhighlight %}
