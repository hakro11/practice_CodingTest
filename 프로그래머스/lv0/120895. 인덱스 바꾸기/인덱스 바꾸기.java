class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        char tmpChar = my_string.charAt(num1);

        char[] newMy_string = my_string.toCharArray();

        newMy_string[num1] = newMy_string[num2];
        newMy_string[num2] = tmpChar;

        for (int i = 0; i < newMy_string.length; i++){
            answer += newMy_string[i];
        }
        return answer;
    }
}