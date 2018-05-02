---
layout: post
title: 자바스크립트 스터디 15일차 - 클로저, arguments
author: jh
tags: [study, javascript]
---
# 클로저
내부함수는 외부함수의 지역변수에 접근할 수 있다.
{% highlight js %}
function factory_movie(title){
    return {
        get_title : function (){
            return title;
        },
        set_title : function(_title){
            title = _title
        }
    }
}
ghost = factory_movie('Ghost in the shell');
matrix = factory_movie('Matrix');
 
alert(ghost.get_title());
alert(matrix.get_title());
 
ghost.set_title('공각기동대');
 
alert(ghost.get_title());
alert(matrix.get_title());
{% endhighlight %}

## 클로저를 잘못 사용한 예
{% highlight js %}
var arr = []
for(var i = 0; i < 5; i++){
    arr[i] = function(){
        return i;
    }
}
for(var index in arr) {
    console.log(arr[index]());
}
{% endhighlight %}
정상출력이 되게 변경
{% highlight js %}
var arr = []
for(var i = 0; i < 5; i++){
    arr[i] = function(id) {
        return function() {
            return id;
        }
    }(i);
}
for(var index in arr) {
    console.log(arr[index]());
}
{% endhighlight %}

# arguments
함수에 전달된 인자를 모두 가지고 있는 유사배열(array like)임
{% highlight js %}
function sum(){
    var i, _sum = 0;    
    for(i = 0; i < arguments.length; i++){
        document.write(i+' : '+arguments[i]+'<br />');
        _sum += arguments[i];
    }   
    return _sum;
}
console.log('result : ' + sum(1,2,3,4)); // 10
{% endhighlight %}

{% highlight js %}
function zero(){
    console.log(
        'zero.length', zero.length,
        'arguments', arguments.length
    );
}
function one(arg1){
    console.log(
        'one.length', one.length,
        'arguments', arguments.length
    );
}
function two(arg1, arg2){
    console.log(
        'two.length', two.length,
        'arguments', arguments.length
    );
}
zero(); // zero.length 0 arguments 0 
one('val1', 'val2');  // one.length 1 arguments 2 
two('val1');  // two.length 2 arguments 1
{% endhighlight %}
