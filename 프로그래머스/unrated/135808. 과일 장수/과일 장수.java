import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int length = score.length;
        
        Arrays.sort(score); // 점수 오름차순으로 정렬
        
        int a = length / m; // 상자를 총 몇 개 만들 수 있는지
        int b = length - m * a; // 버리는 과일 갯수이자 포장을 시작할 인덱스
        
        int sum = 0;
        for (int i = b; i < length; i += m) {
            sum = sum + score[i] * m;
        }

        return sum;
    }
}