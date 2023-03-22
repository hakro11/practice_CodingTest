class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        for (int c1 = 0, c2 = 0, i = 0; ; i++){
            if (i >= goal.length){
                answer = "Yes";
                break;
            }

            if (!cards1[c1].equals(goal[i]) && !cards2[c2].equals(goal[i])){
                answer = "No";
                break;
            }

                if (cards1[c1].equals(goal[i])){
                    c1++;
                    if(c1 >= cards1.length){
                        c1--;
                    }
                }else {
                    c2++;
                    if(c2 >= cards2.length){
                        c2--;
                    }
                }
        }
        
        return answer;
    }
}