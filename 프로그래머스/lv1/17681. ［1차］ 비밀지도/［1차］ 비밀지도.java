import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binaryStringArr1 = binaryStringMap(n, arr1);
        String[] binaryStringArr2 = binaryStringMap(n, arr2);

        drawNewMap(answer, binaryStringArr1, binaryStringArr2);

        return answer;
    }

    public String[] binaryStringMap(int n, int[] arr) {
        String[] newMap = new String[n];

        for (int i = 0; i < arr.length; i++) {
            int targetNum = arr[i];
            String binaryString = "";

            while (true) {
                binaryString = (targetNum % 2 == 1 ? "1" : "0") + binaryString;
                targetNum /= 2;
                if (targetNum <= 0) break;
            }

            binaryString = checkStringLength(n, binaryString);
            newMap[i] = binaryString;
        }

        return newMap;
    }

    public String checkStringLength(int n, String binaryString) {
        String str = binaryString;

        while (true) {
            if (str.length() >= n) break;
            str = "0" + str;
        }

        return str;
    }

    public void drawNewMap(String[] answer, String[] arr1, String[] arr2) {
        for (int i = 0; i < answer.length; i++) {
            String str = "";

            for (int j = 0; j < arr1[i].length(); j++) {
                if (arr1[i].charAt(j) == '1' || arr2[i].charAt(j) == '1') {
                    str += "#";
                } else {
                    str += " ";
                }
            }

            answer[i] = str;
        }
    }
}