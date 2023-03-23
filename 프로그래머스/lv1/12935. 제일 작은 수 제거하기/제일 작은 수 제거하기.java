import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] copyArr = arr.clone();
        int answerLength = arr.length -1;
        int[] answer;
        
        if(answerLength > 0){
            int minNum = Arrays.stream(copyArr).min().getAsInt();
            answer = Arrays.stream(copyArr)
                    .filter(i -> i != minNum)
                    .toArray();
        }else {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}