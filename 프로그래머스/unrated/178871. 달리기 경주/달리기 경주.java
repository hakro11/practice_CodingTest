import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
       String[] answer = players.clone();
        Map<String, Integer> rank =setRank(players);

        for(int i = 0, idx; i < callings.length; i++){
            idx = rank.get(callings[i]);
            
            rank.replace(callings[i], idx, idx-1);
            rank.replace(answer[idx-1], rank.get(answer[idx-1]), rank.get(answer[idx-1])+1);
            
            answer[idx] = answer[idx-1];
            answer[idx-1] = callings[i];

        }
        
        rank.clear();

        return answer;
    }

    public static Map<String, Integer> setRank(String[] players){
        Map<String, Integer> ranking = new HashMap<>();

        for(int i = 0; i < players.length; i++){
            ranking.put(players[i], i);
        }

        return ranking;
    }
}