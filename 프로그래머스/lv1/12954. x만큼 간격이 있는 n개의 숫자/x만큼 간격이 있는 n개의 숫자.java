import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();
        
        for(long i = x ; list.size() < n; i += x){
            list.add(i);
        }

        return list.stream().mapToLong(i->i).toArray();
    }
}