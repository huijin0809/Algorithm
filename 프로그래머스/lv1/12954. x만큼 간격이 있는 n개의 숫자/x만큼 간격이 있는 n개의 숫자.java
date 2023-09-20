class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        int a = x; // 증가할 숫자
        long b = x; // 증가하는 숫자를 담을 변수
        
        for (int i = 0; i < n; i++) {
            answer[i] = b;
            b = b + a;
        }
        
        return answer;
    }
}