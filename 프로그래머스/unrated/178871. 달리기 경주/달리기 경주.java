import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players.clone();
        Map<String, Integer> map = makeMap(players);
        
        for(int i = 0, idx; i < callings.length; i++){
            idx = map.get(callings[i]);

            map.replace(callings[i], idx-1);
            map.replace(answer[idx-1], map.get(answer[idx-1])+1);

            answer[idx] = answer[idx-1];
            answer[idx-1] = callings[i];

        }
        
        return answer;
    }
    
    public Map<String, Integer> makeMap(String[] players){
        Map<String, Integer> make = new HashMap<>();
        
        for(int i = 0; i < players.length; i++){
            make.put(players[i], i);
        }
        
        return make;
    }
}