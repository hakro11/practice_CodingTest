import static java.lang.Integer.parseInt;

class Solution {
    public String solution(String polynomial) {
        String answer = "";

        int findX = 0;
        int findNum = 0;

        String[] polynomialArr = polynomial.split(" \\+ ");
        for(int i = 0; i < polynomialArr.length ; i++){
            if(polynomialArr[i].endsWith("x")){
                if(polynomialArr[i].length() == 1){
                    findX++;
                }else{
                    polynomialArr[i] = polynomialArr[i].replace("x","");
                    findX += parseInt(String.valueOf(polynomialArr[i]));
                }
            }else{
                findNum += parseInt(String.valueOf(polynomialArr[i]));
            }
        }

        if(findX != 0 && findNum != 0){
            if( findX == 1){
                answer = "x + " +findNum;
            }else {
                answer = findX + "x + " + findNum;
            }
        } else if (findX == 0 && findNum != 0) {
            answer = findNum + "";
        } else if (findX != 0 && findNum == 0) {
            if(findX == 1){
                answer = "x";
            }else {
                answer = findX + "x";
            }
        }
        return answer;
    }
}