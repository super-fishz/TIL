## [black jack](https://www.acmicpc.net/problem/2798)

### Problem
주어진 카드 중 3장을 골라, 그 합이 m 가장 가까운 값을 리턴

### Solve
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int max = 0;
        outline : for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {

                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum <= m) {
                        max = Math.max(max, sum);
                    }

                    if(max == m) {
                        break outline;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
```
