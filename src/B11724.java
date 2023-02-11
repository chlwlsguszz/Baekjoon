import java.io.*;

public class B11724 {
    static int n;
    static int m;
    static int adj[][];
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str[] = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        adj = new int[n+1][n+1];

        visited = new boolean[n+1];

        for(int i=0;i<m;i++) {
            str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            adj[a][b] = 1;
            adj[b][a] = 1;
        }

        int count = 0;
        for (int i=1;i<n+1;i++) {
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }
        bw.write(count+"\n");
        bw.flush();
    }

    public static void dfs(int v) {
        visited[v] = true;
        for (int i=1;i<n+1;i++) {
            if(adj[v][i]==1 && !visited[i])
                dfs(i);
        }
    }
}
