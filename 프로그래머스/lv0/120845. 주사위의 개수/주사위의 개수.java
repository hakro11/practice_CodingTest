class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int n1, n2, n3;
		
		n1 = box[0] / n;
		n2 = box[1] / n;
		n3 = box[2] / n;
		
		answer = n1 * n2 * n3;
        
        return answer;
    }
}