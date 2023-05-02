import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hallOfFame = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            hallOfFame.add(score[i]);
            answer[i] = announceScore(k, reverseSorting(hallOfFame));
        }

        return answer;
    }
    
    public int[] reverseSorting(List<Integer> hallOfFame) {
        int[] listToArr = hallOfFame.stream().sorted().mapToInt(i -> i).toArray();
        int[] result = new int[listToArr.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = listToArr[listToArr.length - 1 - i];
        }

        return result;
    }

    public int announceScore(int k, int[] reverseSoringArr) {
        if (reverseSoringArr.length <= k) {
            return reverseSoringArr[reverseSoringArr.length-1];
        }else{
            return reverseSoringArr[k-1];
        }

    }
}