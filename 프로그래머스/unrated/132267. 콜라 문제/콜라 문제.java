class Solution {
    public int solution(int a, int b, int n) {
        int answer =0;

        do{ int x; int xp;
            x = n/a;
            xp = n%a;
            answer += x*b;
            n = x*b +xp;
            if(n/a < 1) break;           
        }while(true);       
        return answer;
    }
}