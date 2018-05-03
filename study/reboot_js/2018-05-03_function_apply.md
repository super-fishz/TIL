---
layout: post
title: 자바스크립트 스터디 16일차 - 함수의 호출
author: jh
tags: [study, javascript]
---
# apply 소개
{% highlight js %}
o1 = {val1:1, val2:2, val3:3}
o2 = {v1:10, v2:50, v3:100, v4:25}
function sum(){
    var _sum = 0;
    for(name in this){
        _sum += this[name];
    }
    return _sum;
}
alert(sum.apply(o1)) // 6
alert(sum.apply(o2)) // 185
{% endhighlight %}
apply의 첫번째 인자로 this 값을 넣어줄 수 있음


[arguments 와 apply, bind](https://www.zerocho.com/category/JavaScript/post/57433645a48729787807c3fd)
[이상한모임 - apply, call, bind](https://blog.weirdx.io/post/3214)
