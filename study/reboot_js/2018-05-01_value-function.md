---
layout: post
title: 자바스크립트 스터디 14일차 - 값으로서의 함수
author: jh
tags: [study, javascript]
---
## 값으로서의 함수
[https://opentutorials.org/course/743/6508](https://opentutorials.org/course/743/6508)
{% highlight js %}
function cal(func, num){
    return func(num)
}
function increase(num){
    return num+1
}
function decrease(num){
    return num-1
}
console.log(cal(increase, 1)); // 2
console.log(cal(decrease, 1)); // 0
{% endhighlight %}

자바스크립트에서 함수는 일급 함수다(변수, 매개변수, 리턴값 으로 사용 가능)

## callback
{% highlight js %}
function sortNumber(a,b){
    // 위의 예제와 비교해서 a와 b의 순서를 바꾸면 정렬순서가 반대가 된다.
    return b-a;
}
const numbers = [20, 10, 9,8,7,6,5,4,3,2,1];
console.log(numbers.sort(sortNumber)); // array, [20,10,9,8,7,6,5,4,3,2,1]
{% endhighlight %}
sort
자바스크립트의 sort는 stable sort 가 아님
https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Array/sort

