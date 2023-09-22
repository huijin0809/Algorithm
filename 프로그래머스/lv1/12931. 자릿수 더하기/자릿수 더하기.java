import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int sum = 0; // 누적 합계
        for (int i = 0; n > 0; i++) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}