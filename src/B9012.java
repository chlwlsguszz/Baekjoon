import java.util.Scanner;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=0;i<n;i++) {
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            String str = scanner.next();
            for(int j=0;j<str.length();j++) {
                char c = str.charAt(j);
                if(c == '(')
                    stack.push(c);
                else if (c == ')') {
                    if (stack.empty()) {
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if(flag == false)
                System.out.println("NO");
            else {
                if(stack.empty())
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }

    }
}

