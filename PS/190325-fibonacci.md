# [fibonacci number](https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=recursion-backtracking)
## Proble
## Solve
```java
import java.util.*;

public class Solution {

    public static int fibonacci(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n -1) + fibonacci(n-2);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
```
재귀를 통해 답을 구함
