import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2606 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean[] visited = new boolean[n+1];

        LinkedList<Integer>[] adjList = new LinkedList[n+1];
        for(int i=1;i<=n;i++)
            adjList[i] = new LinkedList<Integer>();

        for(int i=0;i<m;i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }

        Queue<Integer> queue = new LinkedList<>();
        visited[1] = true;
        queue.add(1);

        int count = 0;

        while(!queue.isEmpty()) {
            int v = queue.poll();

            Iterator<Integer> it = adjList[v].listIterator();
            while(it.hasNext()) {
                int w = it.next();
                if(!visited[w]) {
                    visited[w] = true;
                    queue.add(w);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
