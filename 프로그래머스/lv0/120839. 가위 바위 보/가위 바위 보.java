class Solution {
    public String solution(String rsp) {
        String answer = "";
        		char[] change = rsp.toCharArray();
		
		for(int i = 0 ;i < change.length; i++) {
			if(change[i] == '0') {
				answer += "5";
			}
			if(change[i] == '2') {
				answer += "0";
			}
			if(change[i] == '5') {
				answer += "2";
			}
        
        }
        return answer;
    }
}