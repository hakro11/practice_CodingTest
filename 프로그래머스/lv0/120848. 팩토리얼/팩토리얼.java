class Solution {
    public int solution(int n) {
        int answer = 0;		
		int num = 1;
        
		for(int i = 1 ; i < 11 ; i++) {
			num *= i;
			if(n >= num && n < num * (i+1)) {
				answer = i;
				break;
			}
		}
        return answer;
    }
}