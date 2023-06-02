import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        
        if (cacheSize != 0) {
            int answer = 0;
            Queue<String> queue = new LinkedList<>();

            for (String cityName : cities) {
                String changeName = cityName.toLowerCase();

                if (queue.size() < cacheSize) {
                    answer += queue.contains(changeName) ? 1 : 5 ;
                } else if (!queue.contains(changeName)) {
                    answer += 5;
                    queue.poll();
                } else {
                    answer++;
                    queue.remove(changeName);
                }

                queue.offer(changeName);
            }

            return answer;

        } else {
            return cities.length * 5;
        }
        
    }
}