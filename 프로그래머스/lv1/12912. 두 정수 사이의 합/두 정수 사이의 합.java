import java.util.stream.LongStream;

class Solution {
    public long solution(int a, int b) {
        long answer;
        if(a > b ){
            answer = LongStream.rangeClosed(b, a).sum();
        }else if( a == b ){
            answer = a;
        }else {
            answer = LongStream.rangeClosed(a, b).sum();
        }
        return answer;
    }
}