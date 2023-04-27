class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long num2 = Long.parseLong(p);
        int strLength = p.length();
        
        for(int i = 0; i <= t.length() - strLength; i++){
            long num1 = Long.parseLong(t.substring(i, i + strLength));
            if(num1 <= num2){
                answer++;
            }
        }
        
        return answer;
    }
}