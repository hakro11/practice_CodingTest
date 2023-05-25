import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> mapOfparticipant = makeMap(participant);

        for(int i = 0; i < completion.length; i++){
            if(mapOfparticipant.get(completion[i]) == 0){
                mapOfparticipant.remove(completion[i]);
            } else if (mapOfparticipant.get(completion[i]) > 0) {
                mapOfparticipant.replace(completion[i], mapOfparticipant.get(completion[i]), mapOfparticipant.get(completion[i])-1);
            }
        }

        char[] charArr = mapOfparticipant.keySet().toString().toCharArray();
        String answer = "";

        for(int i = 1; i < charArr.length -1; i++){
            answer += charArr[i];
        }

        return answer;
    }

    public Map<String, Integer> makeMap(String[] participant){
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            if (!map.containsKey(participant[i])) {
                map.put(participant[i], 0);
            }else {
                map.replace(participant[i], map.get(participant[i]), map.get(participant[i])+1);
            }
        }

        return map;
    }
}