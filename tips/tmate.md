# tmate
[tmate](https://tmate.io/)
linux screen 의 강화판인 tmux 를 sharing 할 때 도와주는 도구.

tmate를 사용하면 내부 네트워크의 terminal도 외부로 공유할 수 있다. 일반 세션과 readonly 세션을 동시에 공유가능

tmate 의 단축키가 tmux 와 100% 호환되지는 않는다. 일부 옵션은 충돌함...

tmate 서버를 통해서 전달하기 때문에 간혹 느린 경우가 있다.(이건 tmate.io 의 own tmate server 를 주면 될듯)

오늘 적으려던 내용은 tmate session 어태치

## session attach
실수로 세션을 디태치 시켰을 경우
`tmate ls` 로 세션 목록을 확인하여 `tmate  -S /tmp/tmate-502/5qlGtD attach` 이런 식으로 tmate 세션을 어태치 시킬 수 있다.
