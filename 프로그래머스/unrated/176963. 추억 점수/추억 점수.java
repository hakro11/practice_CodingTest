class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                answer[i] += calc(name, yearning, photo[i][j]);
            }
        }
        return answer;
    }
    
    public int calc(String[] name, int[] yearning, String photo){
        for(int i = 0; i < name.length; i++){
            if(photo.equals(name[i])){
                return yearning[i];
            }
        }
        return 0;
    }
}