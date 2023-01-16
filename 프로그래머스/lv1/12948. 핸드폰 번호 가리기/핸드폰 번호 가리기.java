class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        char[] change = phone_number.toCharArray();
		for(int i = 0 ; i < change.length -4 ; i++) {
			change[i] = '*';
			answer += change[i];
		}
		
		for(int i = change.length-4 ; i < change.length ; i++) {
			answer += change[i];
		}
        
        return answer;
    }
}