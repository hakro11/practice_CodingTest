class Solution {
    public int[] solution(int N, int[] stages) {
        		int[] answer = new int[N];

		float[] perfalse = new float[N];
		for(int i = 1 ; i < N+1 ; i++) {
			int ch = 0;
			int clear = 0;
			for(int k = 0 ; k < stages.length ; k++) {
				if(stages[k] >= i) {
					ch++;
				}
				if(stages[k] > i) {
					clear++;
				}
			}
			perfalse[i-1] = (float)(ch - clear) /ch;
		}
		
		for(int i = 0 ; i < answer.length ; i++) {
			answer[i] = i+1;
		}
		
		for(int i = 0 ; i < perfalse.length-1 ; i++) {
			for(int j = i+1 ; j < perfalse.length; j++) {
				if(perfalse[i] < perfalse[j] || (perfalse[i] == perfalse[j] && answer[i] > answer[j])) {
					float savepe = perfalse[i];
					int savean = answer[i];
					
					perfalse[i] = perfalse[j];
					perfalse[j] = savepe;
					
					answer[i] = answer[j];
					answer[j] = savean;
				}
			}
		}
        return answer;
    }
}