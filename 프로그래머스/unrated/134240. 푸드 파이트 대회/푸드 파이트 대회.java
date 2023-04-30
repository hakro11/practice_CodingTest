class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1, kindOfFood = 0; i < food.length; i++){
            if(food[i] > 1){
                kindOfFood = food[i] / 2;
                for(int j = 0; j < kindOfFood; j++){
                    answer += i + "";
                }
            }
        }

        answer += "0" + reverseStr(answer);

        return answer;
    }

    public String reverseStr(String answer){
        String newStr = "";

        for(int i = answer.length() -1 ; i >= 0 ; i--){
            newStr += answer.substring(i, i+1);
        }

        return newStr;
    }
}