# node
[node.js](https://nodejs.org/ko/)

[history](https://trends.google.com/trends/explore?date=all&geo=US&q=%2Fm%2F0bbxf89,nodejs,node.js)

`Node.js®는 Chrome V8 JavaScript 엔진으로 빌드된 JavaScript 런타임입니다.` 

````javascript
// 비동기 이벤트 주도 JavaScript 런타임으로써 Node는 확장성 있는 네트워크 애플리케이션을 만들 수 있도록 설계되었습니다.
// 다음 "hello world" 예제는 다수의 연결을 동시에 처리할 수 있습니다.
// 각 연결에서 콜백이 실행되는데 실행할 작업이 없다면 Node는 대기합니다.

const http = require('http');

const hostname = '127.0.0.1';
const port = 3000;

const server = http.createServer((req, res) => {
      res.statusCode = 200;
        res.setHeader('Content-Type', 'text/plain');
          res.end('Hello World\n');
});

server.listen(port, hostname, () => {
      console.log(`Server running at http://${hostname}:${port}/`);
});
````

## V8
크롬에 들어가 있는 자바스크립트 인터프리터 [wiki](https://ko.wikipedia.org/wiki/%ED%81%AC%EB%A1%AC_V8)

## 사용법
### 설치
* https://nodejs.org/en/download/
* 현재 LTS 8.xx
  * https://nodejs.org/en/blog/release/v8.0.0/
* 2018년 10월부터 LTS 10.xx
  * https://nodejs.org/en/blog/release/v10.0.0/
* 버전별 es 지원 테이블
  * https://node.green/
### es...
* [2016년과 이후 JavaScript의 동향](https://d2.naver.com/helloworld/3618177)
* [2017년과 이후 JavaScript의 동향 - JavaScript(ECMAScript)](https://d2.naver.com/helloworld/2809766)
* [2018년과 이후 JavaScript의 동향 - JavaScript(ECMAScript)](https://d2.naver.com/helloworld/7495331)
* [2018년과 이후 JavaScript의 동향 - 라이브러리와 프레임워크](https://d2.naver.com/helloworld/3259111)
* [es6, 7, 8](https://medium.com/@madasamy/javascript-brief-history-and-ecmascript-es6-es7-es8-features-673973394df4)

### 생태계
#### 패키지 매니저
* npm(default)
  * 디팬던시 관리
* yarn(facebook 에서 만듬)
  * http://fetobe.co.kr/%EC%83%88%EB%A1%9C%EC%9A%B4-npm-client-yarn/
* package.json
  * package-lock.json???
    * 설치된 모듈의 디팬던시를 고정하는 파일
    * https://trustyoo86.github.io/npm/2018/01/10/package-lock-introduction.html
* https://www.npmjs.com/
* https://www.npmtrends.com/

## Debugging
[node debugging guide](https://nodejs.org/ko/docs/guides/debugging-getting-started/)

## named modules
* webserver
  * [express-vs-hapi-vs-koa-vs-sails](https://www.npmtrends.com/express-vs-hapi-vs-koa-vs-sails)
* express - template
  * http://expressjs.com/en/guide/using-template-engines.html
* orm
  * [bookshelf, knex, sequelize, objection.js](https://www.npmtrends.com/bookshelf-vs-knex-vs-objection-vs-sequelize)
* test
  * https://www.npmtrends.com/ava-vs-jasmine-vs-jest-vs-mocha-vs-qunit-vs-chai
* etc
  * 진짜 유틸 라이브러리들
    * [https://www.npmtrends.com/lodash-vs-ramda-vs-underscore](https://www.npmtrends.com/lodash-vs-ramda-vs-underscore)
  * socket
    * https://www.npmtrends.com/express-ws-vs-socket.io-vs-websocket-vs-ws
  * request
    * https://www.npmtrends.com/axios-vs-isomorphic-fetch-vs-node-fetch-vs-request-vs-request-promise
  * jwt
    * https://www.npmtrends.com/jsonwebtoken-vs-jwt-vs-jwt-decode-vs-jwt-js-vs-jwt-simple
  * oauth
    * https://www.npmtrends.com/auth0-vs-express-session-vs-express-sessions-vs-passport-vs-passport-jwt

## 또 다른 이야기 graph ql
* https://www.apollographql.com/
