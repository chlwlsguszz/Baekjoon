import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B2667 {

    static int n;
    static int[][] map;
    static boolean[][] visited;

    static int total=0;
    static int count;
    static List<Integer> counts = new ArrayList<>();

    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, 0, 0};


    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0;i<n;i++) {
            String str = br.readLine();
            for(int j=0;j<n;j++) {
                map[i][j] = Integer.parseInt(str.split("")[j]);
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                count = 0;
                if(map[i][j]==1 && !visited[i][j]) {
                    total++;
                    count++;
                    dfs(i,j);
                    counts.add(count);
                }
            }
        }

        bw.write(String.valueOf(total)+"\n");
        Collections.sort(counts);
        for(int val : counts) {
            bw.write(String.valueOf(val)+"\n");
        }
        bw.flush();
    }

    static void dfs(int curY, int curX) {
        visited[curY][curX] = true;

        int nextY, nextX;
        for(int i=0; i<4; i++) {
            nextY = curY + dirY[i];
            nextX = curX + dirX[i];

            if(nextY>=0 && nextY<n && nextX>=0 && nextX<n) {
                if (!visited[nextY][nextX] && map[nextY][nextX] == 1) {
                    count++;
                    dfs(nextY, nextX);
                }
            }
        }
    }
}
