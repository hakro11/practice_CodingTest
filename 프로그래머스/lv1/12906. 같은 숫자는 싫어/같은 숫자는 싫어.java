import java.util.*;

class Solution{
    public int[] solution(int[] arr){
        List<Integer> list = new ArrayList<>();
        int saveNum = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(saveNum != arr[i]){
                list.add(saveNum);
                saveNum = arr[i];
            }

        }
        if(list.size() != 0 && (int)list.get(list.size()-1) != saveNum){
            list.add(saveNum);
        }else if(list.size() <= 0){
            list.add(arr[0]);
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}