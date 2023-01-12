import java.math.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int rightlength = 0;
        int leftlength = 0;
        int lefthand = 10;
        int righthand = 12;
        String same = "";

        if(hand.equals("right")) {
            same = "R";
        }else {
            same = "L";
        }

        for(int i = 0 ; i < numbers.length ; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                lefthand = numbers[i];
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                righthand = numbers[i];
            }

            if(numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 ||numbers[i] == 0) {
                if(numbers[i] == 0) {
                    numbers[i] = 11;
                }
                rightlength = Math.abs(((righthand - numbers[i])) / 3) + Math.abs(((righthand - numbers[i])) % 3);
                leftlength = Math.abs(((lefthand - numbers[i])) / 3) + Math.abs(((lefthand - numbers[i])) % 3);


                if(rightlength == leftlength) {
                    answer += same;
                    if(same.equals("R")){
                        righthand = numbers[i];
                    }else {
                        lefthand = numbers[i];
                    }
                }else if(rightlength > leftlength) {
                    answer += "L";
                    lefthand = numbers[i];
                }else {
                    answer += "R";
                    righthand = numbers[i];
                }
            }
        }
        return answer;

    }
}