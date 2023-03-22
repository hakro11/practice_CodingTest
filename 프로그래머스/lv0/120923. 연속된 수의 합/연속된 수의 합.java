class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int startNum;
        
        if(num % 2 == 0){
            startNum = (total / num)+1 - (num / 2);
        }else{
            startNum = (total / num) - (num / 2);
        }

        for (int i = 0; i < answer.length; i++){
            answer[i] = startNum;
            startNum++;
        }
        
        return answer;
    }
}