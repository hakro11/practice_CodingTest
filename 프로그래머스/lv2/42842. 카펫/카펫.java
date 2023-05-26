class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        
        return locationList(total, brown);
    }
    
    public int[] locationList(int total, int brown){
        int[] answer = new int[2]; 
        int stNum = 3;
        int x = 0;
        int y = 0;

        while(true){
            if(stNum >= total) break;
            
            if(total % stNum == 0 ){
                x = total / stNum;
                y = stNum;
                
                if(2*x + (y-2)*2 == brown) break;
                if(y > x) break;
            }
            
            stNum++;
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }

}