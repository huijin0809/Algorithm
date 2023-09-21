import java.lang.*;

class Solution {
    public int solution(String t, String p) {
        int cnt = 0;
        int length = t.length() - p.length() + 1;
        
        for (int i = 0; i < length; i++) {
            String temp = t.substring(i, p.length() + i);
            long intT = Long.parseLong(temp);
            long intP = Long.parseLong(p);
            if (intT <= intP) {
                cnt++;
            }
        }
        
        return cnt;
    }
}