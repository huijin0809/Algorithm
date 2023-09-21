import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            int sum = 0; // answer 배열에 저장될 그리움 점수 합계
            for (int j = 0; j < photo[i].length; j++) {
                int index = Arrays.asList(name).indexOf(photo[i][j]); // 일치하는 name 배열의 인덱스 반환
                if (index != -1) {
                    sum = sum + yearning[index]; // 일치하는 인덱스의 점수를 합계에 누적
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}