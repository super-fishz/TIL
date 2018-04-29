---
layout: post
title: 자바스크립트 스터디 12일차 - 정규표현식
author: jh
tags: [study, javascript]
---
## 정규표현식

* 컴파일
    * 패턴을 찾는 것
* 실행
    * 구체적인 작업을 하는 것
{% highlight js %}
const pattern1 = /a/;
const pattern2 = new RegExp('a');

RegExp.exec
{% endhighlight %}
[regexp exec](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/RegExp/exec)
찾아서 결과를 list로 반환
[regexp test](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/RegExp/test)
찾은 결과가 있는지 true, false 를 반환

## 문자열 메소드
[string match](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/match)
주어진 string 에서 문자열을 찾음
[string replace](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace)
주어진 string 에서 문자열을 찾아서 치환함

## regular expression option
`i`는 incase, 대소문자구분없이
`g`는 global, 여러번 매칭될 수 있음
g 쓰기전에 한번 읽어보면 좋음 https://stackoverflow.com/questions/32421632/why-does-the-g-flag-change-the-result-of-a-javascript-regular-expression?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa


## capture
{% highlight js %}
const pattern = /(\w+)\s(\w+)/;
const str = "coding everybody";
const result = str.replace(pattern, "$2, $1");

console.log(result); // everybody, coding
{% endhighlight %}
