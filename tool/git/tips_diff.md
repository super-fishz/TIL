# git diff 는 git 으로 관리되고 있지 않는 폴더도 diff 가 가능하다.

A 폴더와 B 폴더 모두 git 으로 관리되고 있지 않을때

```shell
git diff --diff-filter=M --word-diff A B
```

와 같이 폴더 째로 비교를 해볼 수 있다.
