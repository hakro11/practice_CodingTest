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

            while (targetNum > 0) {
                binaryString = (targetNum % 2 == 1 ? "1" : "0") + binaryString;
                targetNum /= 2;
            }

            binaryString = checkStringLength(n, binaryString);
            newMap[i] = binaryString;
        }

        return newMap;
    }

    public String checkStringLength(int n, String binaryString) {
        String str = binaryString;

        while (str.length() < n) {
            str = "0" + str;
        }

        return str;
    }

    public void drawNewMap(String[] answer, String[] arr1, String[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            String str = "";
            for (int j = 0; j < arr1[i].length(); j++) {
                str += (arr1[i].charAt(j) == '1' || arr2[i].charAt(j) == '1') ? "#" : " ";
            }

            answer[i] = str;
        }
    }
}