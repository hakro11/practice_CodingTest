import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> userData = new HashMap<>();
        Map<Integer, String[]> checkOfUserAction = new HashMap<>();
        int idx = 0;
        
        for(int i = 0; i < record.length; i++){
            String[] check = record[i].split(" ");
            
            switch(check[0]){
                case "Enter" :
                    if(!userData.containsKey(check[1])){
                        userData.put(check[1], check[2]);    
                    }else{
                        userData.replace(check[1], check[2]);
                    }
                    
                    checkOfUserAction.put(idx, new String[]{check[1], "님이 들어왔습니다."});
                    idx++;
                    break;
                    
                case "Leave" :
                    checkOfUserAction.put(idx, new String[]{check[1], "님이 나갔습니다."});
                    idx++;
                    break;
                    
                case "Change" :
                    userData.replace(check[1], check[2]);
                    break;
            }
        }
        
        String[] answer = new String[idx];
        for(int i = 0; i < answer.length; i++){
            String[] getData = checkOfUserAction.get(i);
            
            answer[i] = userData.get(getData[0]) + getData[1];
        }
        
        
        return answer;
    }
}