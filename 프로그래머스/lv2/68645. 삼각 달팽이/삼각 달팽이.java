import java.util.*;

class Solution {
    int value = 0;
    int height;
    int totalCycle = 0;

    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int[][] dataMap = new int[n][];
        this.height = n;

        for(int i = 0; i < dataMap.length;i++){
            dataMap[i] = new int[i+1];
        }

        cycle1(dataMap);
        readValue(dataMap, list);

        return list.stream().mapToInt(i -> i).toArray();
    }

    public void readValue(int[][] dataMap, List list) {
        for (int i = 0; i < dataMap.length; i++) {
            for (int j = 0; j < dataMap[i].length; j++) {
                list.add(dataMap[i][j]);
            }
        }
    }

    public void cycle1(int[][] dataMap) {
        int cnt = 0;
        for (int i = totalCycle; i < height - totalCycle; i++) {
            if (dataMap[i][totalCycle] == 0) {
                dataMap[i][totalCycle] = ++value;
                cnt++;
            }
        }

        for (int i = totalCycle+1, n = height - totalCycle-1; i < n; i++) {
            if (dataMap[n][i] == 0) {
                dataMap[n][i] = ++value;
                cnt++;
            }
        }

        int x = height-totalCycle-1, y = height-(2*totalCycle)-1;
        while (true){
            if( x < totalCycle*2 && y < totalCycle) break;

            if(dataMap[x][y] == 0 ){
                dataMap[x][y] = ++value;
                cnt++;
            }
            x--;
            y--;
        }

        if(cnt == 0) return;

        totalCycle++;
        cycle1(dataMap);
    }
}