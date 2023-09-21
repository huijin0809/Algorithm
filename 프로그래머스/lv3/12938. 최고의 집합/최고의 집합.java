import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        if (s < n) { // 집합을 만들 수 없는 경우
            return new int[] {-1};
        }
        
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = s / n; // 균일한 값으로 집합 생성
        }
        
        int rem = s % n; // 집합 생성 후 남은 값
        int index = 0; // 집합을 순회할 인덱스
        while (rem > 0) {
            answer[index++]++;
            rem--;
        }
        
        Arrays.sort(answer); // 오름차순으로 정렬
        
        return answer;
    }
}