import java.util.*;

class Solution {
    public long solution(long n) {
        String strArr = n + "";
        char[] numToCharArr= strArr.toCharArray();
        strArr = "";

        for(int i = 0, numlen = numToCharArr.length; i < numlen; i++){
            for(int j = i+1; j < numlen; j++){
                if(numToCharArr[i] < numToCharArr[j]){
                    char tmp = numToCharArr[i];
                    numToCharArr[i] = numToCharArr[j];
                    numToCharArr[j] = tmp;
                }
            }
            strArr += numToCharArr[i];
        }

        return Long.parseLong(strArr);
    }
}