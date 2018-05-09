---
layout: post
title: 자바스크립트 스터디 19일차 - inheritance
author: jh
tags: [study, javascript]
---
# 상속
js 에서 상속을 사용하려면 prototype을 사용해서 구현하면 된다.
{% highlight js %}
function Ultra(){}
Ultra.prototype.ultraProp = true;

function Super(){}
Super.prototype = new Ultra();

function Sub(){}
Sub.prototype = new Super();

var o = new Sub();
console.log(o.ultraProp);
{% endhighlight %}

객체 o에서 ultraProp를 찾는다.
없다면 Sub.prototype.ultraProp를 찾는다.
없다면 Super.prototype.ultraProp를 찾는다.
없다면 Ultra.prototype.ultraProp를 찾는다.

new 가 없으면 부모의 prototype 이 그대로 가져와지기 때문에 new 는 꼭 필요함
