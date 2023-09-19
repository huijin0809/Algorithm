import java.math.BigInteger;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        // 통분
        int numer3 = (numer1 * denom2) + (numer2 * denom1); // 분자의 합
        int denom3 = denom1 * denom2; // 공통 분모
        System.out.println("두 분수의 합 : " + numer3 + "/" + denom3);
        
        // 최대공약수
        int gcd = getGcd(numer3, denom3);
        System.out.println("최대공약수 : " + gcd);
        
        // 기약분수
        int[] answer = {numer3 / gcd, denom3 / gcd};
        
        return answer;
    }
    
    private int getGcd(int a, int b) {
        BigInteger x = BigInteger.valueOf(a);
        BigInteger y = BigInteger.valueOf(b);
        
        return x.gcd(y).intValue();
    }
}