class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double result = (num1 * 1.0) / num2 * 1000;
        answer = (int) result;
        return answer;
    }
}