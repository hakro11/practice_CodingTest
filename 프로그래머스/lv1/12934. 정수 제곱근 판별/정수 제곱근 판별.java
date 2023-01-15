class Solution {
    public long solution(long n) {
        long answer = -1;
        
        long i = 1;
		while(true) {
			if(n == i * i) {
				answer = (i+1) * (i+1);
				break;
			}
			i++;
			if(i >= 10000000) break;
		}
        
        return answer;
    }
}