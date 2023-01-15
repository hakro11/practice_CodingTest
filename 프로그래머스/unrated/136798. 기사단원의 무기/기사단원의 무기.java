class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] soldier = new int[number];
        int[] soldier_num = new int[number];
        
        for(int i = 0 ; i < number ; i++) {
           soldier[i] = i+1;
           soldier_num[i] = 0;
           for(int j = 1; j * j <= soldier[i] ; j++) {
        	   if(j* j == soldier[i]) soldier_num[i]++;
        	   else if(soldier[i] % j == 0) soldier_num[i] +=2;
           }
            if(soldier_num[i] > limit) {
        	   soldier_num[i] = power;
           }
           answer += soldier_num[i];
        }
        return answer;
    }
}