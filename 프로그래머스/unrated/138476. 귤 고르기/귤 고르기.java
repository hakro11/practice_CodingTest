import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = setMap(tangerine);
        int[] orange = map.values().stream().mapToInt(i -> i).sorted().toArray();

        int boxSize = k;
        int idx = orange.length - 1;
        while (true) {
            boxSize -= orange[idx];
            idx--;
            answer++;
            if (boxSize <= 0) break;
        }

        return answer;
    }

    public Map<Integer, Integer> setMap(int[] tangerine) {
        Map<Integer, Integer> setMap = new HashMap<>();

        for (int size : tangerine) {
            if (!setMap.containsKey(size)) {
                setMap.put(size, 1);
            } else {
                setMap.replace(size, setMap.get(size), setMap.get(size) + 1);
            }
        }

        return setMap;
    }
}