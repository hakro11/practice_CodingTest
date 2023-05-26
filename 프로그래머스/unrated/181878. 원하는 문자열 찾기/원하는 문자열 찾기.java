class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str1 = myString.toLowerCase();
        String str2 = pat.toLowerCase();
        
        answer = str1.contains(str2) ? 1 : 0;
        return answer;
    }
}