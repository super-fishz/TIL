# 아마도 당신은 jquery가 필요 없을지도 모른다
jquery 좋다. Dom selector를 길게 짜야 했던 것들을 많이 줄여줬고, 이벤트 헨들링도 편하게 바꿔줬다.
브라우저 버전에 따른 소소한 변화도 큰 고민없이 의존해도 된다.

이번에 겪은 이슈는 다른 아저씨의 코드를 봐주다가 당면한 문제.
로딩속도를 개선하기 위해 jquery 를 body 후반에 로드했고,
jquery 가 로드되기 전에 `$`를 사용하면서 문제가 됨.

아래 링크에 나온것들을 토대로, jquery 의존성을 걷어낼 수 있다.

* [http://youmightnotneedjquery.com/](http://youmightnotneedjquery.com/)
* [Sans jquery](https://gist.github.com/joyrexus/7307312)
* 혹은 [Vanilla JS](http://vanilla-js.com/) :D
