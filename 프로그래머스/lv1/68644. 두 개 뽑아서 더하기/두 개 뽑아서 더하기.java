import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < numbers.length -1; i++){
            for(int j = i + 1 ; j < numbers.length; j++){
                arr.add(numbers[i] + numbers[j]);
            }
        }
        
        return arr.stream().distinct().sorted().mapToInt(i -> i).toArray();
    }
}