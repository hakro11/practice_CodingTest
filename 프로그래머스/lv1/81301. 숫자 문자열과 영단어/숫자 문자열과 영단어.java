class Solution {
    public int solution(String s) {
        int answer = 0;
        String changeStr = s;

        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < 10 ; i++){
           changeStr = changeStr.replace(str[i], Integer.toString(i));
        }

        answer = Integer.parseInt(changeStr);

        return answer;
    }
}