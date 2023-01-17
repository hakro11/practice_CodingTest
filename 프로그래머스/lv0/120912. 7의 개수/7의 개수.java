class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int num, ap;
        
       for(int i = 0; i < array.length ; i++) {
			num = array[i];
			while(true) {
				ap = num%10;
				num = num/10;
				if(num < 1) {
					if(ap == 7) {
						answer++;
						break;
					}else
						break;
				}
				if(ap == 7) {
					answer++;
				}
			}
		}
        return answer;
    }
}