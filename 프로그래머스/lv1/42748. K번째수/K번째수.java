import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int startNum = 0, endNum = 0, selectNum = 0;
        for(int i = 0; i < commands.length; i++){
            for(int j = 0 ; j < commands[i].length; j++){
                switch (j){
                    case 0 :
                        startNum = commands[i][j];
                        break;

                    case 1:
                        endNum = commands[i][j];
                        break;

                    case 2:
                        selectNum = commands[i][j];
                        break;
                }
            }
            answer[i] = Arrays
                .stream(array, startNum-1, endNum)
                .sorted()
                .toArray()[selectNum-1];
        }
        return answer;
    }
}