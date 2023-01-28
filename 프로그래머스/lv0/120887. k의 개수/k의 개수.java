class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strk = k +"";
		char[] chark = strk.toCharArray();
		
		for(int st = i ; st <= j ; st++) {
			String changeStr = st + "";
			char[] changechar = changeStr.toCharArray();
			for(int st2 = 0 ; st2 < changechar.length ; st2++) {
				if(changechar[st2] == chark[0]) {
					answer++;
				}
			}
		}
        return answer;
    }
}