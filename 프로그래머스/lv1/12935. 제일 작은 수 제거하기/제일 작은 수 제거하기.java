import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int answerLength = arr.length -1;
        int[] answer;

        if(answerLength > 0){
            int minNum = Arrays.stream(arr).min().getAsInt();
            answer = Arrays.stream(arr)
                    .filter(i -> i != minNum)
                    .toArray();
        }else {
            answer = new int[] {-1};
        }
        
        return answer;
    }
}