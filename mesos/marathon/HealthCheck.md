# Marathon 에서 헬스 체크
> ref : http://mesosphere.github.io/marathon/docs/health-checks.html#mesos-level-health-checks
마라톤에 떠 있는 application은 framework 레벨에서 헬스체크를 지원한다.
헬스 체크는 사실 두종류 인데, mesos level 헬스체크와 marathon level 헬스체크가 있다.
디폴트는 marathon 레벨의 헬스체크인 HTTP` 다.

* marathon level 헬스체크
    * HTTP (default)
    * HTTPS
    * TCP
    * COMMAND
* mesos level 헬스체크
    * MESOS_HTTP
    * MESOS_HTTPS
    * MESOS_TCP

marathon 1.4 버전부터 HTTP, HTTPS, TCP 헬스체크가 deprecated 되었다.
동일한 기능을 제공하는 MESOS_HTTP, MESOS_HTTPS, MESOS_TCP로 갈아타면 된다.

## mesos level 헬스체크의 장단점
* 장점
    * newtowking failures 에서 자유롭다
    *  헬스체크가 작업을 실행하는 agent 에 위임되므로, 작업량을 수평적으로 확장할 수 있다.
* 단점
    * agent 에서 수행되므로 리소스가 더 소모된다.
    * Mesos-level health checks require tasks to listen on the container’s loopback interface in addition to whatever interface they require. If you run a service in production, you will want to make sure that the users can reach it.



## marathon level 헬스체크에서 mesos level 헬스체크로 넘어가는 예
HTTP
```
{
  "path": "/api/health",
  "portIndex": 0,
  "protocol": "HTTP",
  "gracePeriodSeconds": 300,
  "intervalSeconds": 60,
  "timeoutSeconds": 20,
  "maxConsecutiveFailures": 3,
  "ignoreHttp1xx": false // 이건 MESOS_HTTP 에는 존재하지 않는다.
}
```
mesos HTTP
```
{
  "path": "/api/health",
  "portIndex": 0,
  "protocol": "MESOS_HTTP",
  "gracePeriodSeconds": 300,
  "intervalSeconds": 60,
  "timeoutSeconds": 20,
  "maxConsecutiveFailures": 3
}
```
