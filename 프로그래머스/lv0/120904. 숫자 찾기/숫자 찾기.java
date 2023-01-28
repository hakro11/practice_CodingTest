class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String strnum = num + "";
		String strk = k + "";
		
		if(strnum.indexOf(strk) != -1) {
			answer = strnum.indexOf(strk) + 1;
		}
        
        return answer;
    }
}