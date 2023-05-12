class Solution {
    static int totalRemove0 = 0;
    static String str = "";
    static int outputLength = 0;

    public int[] solution(String s) {
        int[] answer = new int[2];
        this.str = s;

        int cnt = 0;
        int cnt0 = 0;
        while(!str.equals("1")){
            totalRemove0 += remove0(str);
            str = binaryChange();
            cnt++;
        }

        answer[0] = cnt;
        answer[1] = totalRemove0;

        return answer;
    }

    public int remove0(String str){
        int inputLength = str.length();
        str = str.replace("0", "");
        outputLength = str.length();

        return inputLength - outputLength;
    }

    public String binaryChange(){
        return Integer.toBinaryString(outputLength);
    }
}