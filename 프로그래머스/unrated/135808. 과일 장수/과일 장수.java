import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
		
		int st = score.length-1;
		while(true) {
			if(st - m < -1 ) break;
			if(score[st] == score[st - m +1 ]) {
				answer += score[st] * m;
			}else {
				answer += score[st - m +1] * m;
			}
			st -= m;
		}
		
        return answer;
    }
}