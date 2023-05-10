class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int[] arr = d.clone();
        
        sorting(arr);
        
        for(int i = 0, buy = 0; i < arr.length; i++){
            if(arr[i] + buy <= budget){
                buy += arr[i];
                answer++;
            }else break;
        }
        return answer;
    }
    
    public void sorting(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1, tmp; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}