class Solution {
    public String solution(int[] food) {
        String leftString = "";
        String rightString = "";
        
        int a = 0; // a번의 음식 (칼로리순)
        int cnt = 0; // cnt개씩의 음식
        
        for (int i = 0; i < food.length; i++) {
            if (i != 0 || food[i] > 1) {
                a++;
                cnt = food[i] - (food[i] % 2); // 나머지 버림
                String foodNum = a + ""; // 문자열로 변환
                for (int j = 0; j < cnt / 2; j ++) {
                    leftString = leftString + foodNum;
                    rightString = foodNum + rightString;
                }
            }
        }
        
        return leftString + "0" + rightString;
    }
}