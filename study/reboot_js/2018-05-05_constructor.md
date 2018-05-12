---
layout: post
title: 자바스크립트 스터디 18일차 - 생성자와 new
author: jh
tags: [study, javascript]
---
# 생성자와 new
## 자바스크립트의 객체지향
prototype-based programing


## 객체
객체 안의 변수를 프로퍼티, 함수를 메소드

## 생성자와 new
객체 안의 변수를 프로퍼티, 함수를 메소드
생성자는 사실 함수에 불과하다.

{% highlight js %}
function Person() {}
var p = new Person();

p.name = 'egoing';
p.introduce = function(){
    return 'My name is '+this.name; 
}
{% endhighlight %}

{% highlight js %}
function Person(name){
    this.name = name;

    this.introduce = function(){
        return 'My name is '+this.name; 
    }   
}
var p1 = new Person('egoing');
// console.log(p1.introduce()+"<br />");
 
 var p2 = new Person('leezche');
 // console.log(p2.introduce());
{% endhighlight %}
