import java.util.*;

class Solution {
    public int solution(String dartResult) {
        String[] bonus = dartResult.split("[0-9]+");
        String[] point = dartResult.split("[A-Z](\\*|#)*");
        int[] getPoint = new int[point.length];
        
        for (int i = 0; i < getPoint.length; i++) {
            getPoint[i] = Integer.parseInt(point[i]);
            switch (bonus[i + 1].charAt(0)) {
                case 'D':
                    getPoint[i] *= getPoint[i];
                    break;

                case 'T':
                    getPoint[i] *= getPoint[i] * getPoint[i];
                    break;

                case 'S':
                default:
                    break;
            }

            if (bonus[i + 1].length() > 1) {
                if (i >= 1 && bonus[i + 1].charAt(1) == '*') {
                    getPoint[i-1] *= 2;
                    getPoint[i] *= 2;
                }else if(i == 0 && bonus[i + 1].charAt(1) == '*'){
                    getPoint[i] *= 2;
                }

                if(bonus[i+1].charAt(1) == '#'){
                    getPoint[i] *= -1;
                }
            }
        }

        return Arrays.stream(getPoint).sum();
    }
}