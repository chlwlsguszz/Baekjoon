import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1260 {

    static boolean[] visited;
    static LinkedList<Integer>[] adjList;
    public static void dfs(int v) {
        if(visited[v]) return;

        System.out.print(v + " ");
        visited[v] = true;

        // 해당 노드에 존재하는 노드 수만큼 반복
        for (int i = 0; i < adjList[v].size(); i++) {
            int MIN = 1001;

            // 해당 노드가 가장 낮은 수인지 모두 방문하여 검증
            for (int j = 0; j < adjList[v].size(); j++) {
                int cur = adjList[v].get(j);

                if(!visited[cur]) {
                    MIN = Math.min(MIN, cur);
                }
            }

            if(MIN == 1001) break;

            dfs(MIN);
        }
        System.out.println();
    }
    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.add(v);

        while(!queue.isEmpty()) {
            v = queue.poll();
            System.out.print(v+" ");

            Iterator<Integer> it = adjList[v].listIterator();
            while(it.hasNext()) {
                int w = it.next();
                if(!visited[w]) {
                    visited[w] = true;
                    queue.add(w);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        adjList = new LinkedList[n+1];
        for(int i=1;i<=n;i++) {
            adjList[i] = new LinkedList<Integer>();
        }

        for(int i=0;i<m;i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }

        visited = new boolean[n+1];

        dfs(v);
        bfs(v);
    }
}
