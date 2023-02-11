import java.io.*;
import java.util.Stack;

public class B10773 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value == 0)
                stack.pop();
            else
                stack.push(value);
        }

        int sum=0;
        while(!stack.isEmpty()) {
            sum+= stack.pop();
        }

        bw.write(sum+"\n");
        bw.flush();
    }
}
