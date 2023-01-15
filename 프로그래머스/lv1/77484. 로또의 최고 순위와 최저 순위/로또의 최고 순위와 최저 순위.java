class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
		int[] point = {0, 0};
		
		for(int i = 0 ; i < lottos.length ; i++	) {
			for(int j = 0 ; j < win_nums.length ; j++) {
				if(lottos[i] == win_nums[j]) {
					point[0]++;
					point[1]++;
				}else if(lottos[i] == 0) {
					point[0]++;
					break;
				}
			}
		}
		
		for(int i = 0 ; i < point.length ; i++) {
			switch(point[i]) {
			case 6:
				answer[i] = 1;
				break;
			case 5:
				answer[i] = 2;
				break;
			case 4:
				answer[i] = 3;
				break;
			case 3:
				answer[i] = 4;
				break;
			case 2:
				answer[i] = 5;
				break;
				
			default:
				answer[i] = 6;
			}
		}
        return answer;
    }
}