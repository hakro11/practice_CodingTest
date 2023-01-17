class Solution {
    public String[] solution(String my_str, int n) {
		int volum = 0 ;
        
        if(my_str.length() % n !=0) {
			volum = my_str.length()/n+1;
		}else {
			volum = my_str.length()/n;
		}
        	
		String[] answer = new String[volum];

		int j = 0;
		for(int i = 0 ; i < volum ; i++) {
			if(i <= volum-2) {
			answer[i] = my_str.substring(j*n, (j+1)*n);
			j++;
			}else {
			answer[i] = my_str.substring((j*n), my_str.length());	
			}

        }
        return answer;
    }
}