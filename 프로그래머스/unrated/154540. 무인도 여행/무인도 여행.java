import java.util.*;

class Solution {
    static boolean[][] visited;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[] solution(String[] maps) {
        List<Integer> list = new ArrayList<>();
        this.visited = new boolean[maps.length][maps[0].length()];

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if (maps[i].charAt(j) != 'X' && !visited[i][j]) {
                    list.add(bfs(i, j, maps));
                }
            }
        }

        if (list.size() == 0) {
            return new int[]{-1};
        } else {
            return list.stream().sorted().mapToInt(i -> i).toArray();
        }

    }

    private static int bfs(int x, int y, String[] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});

        int sum = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            if (visited[curX][curY]) continue;
            visited[curX][curY] = true;

            sum += maps[curX].charAt(curY) - '0';

            for (int i = 0; i < dir.length; i++) {
                int nextX = curX + dir[i][0];
                int nextY = curY + dir[i][1];

                if (nextX < 0 || nextX >= maps.length || nextY < 0 || nextY >= maps[0].length()) continue;
                if (visited[nextX][nextY] || maps[nextX].charAt(nextY) == 'X') continue;

                queue.offer(new int[]{nextX, nextY});
            }
        }

        return sum;
    }

}
