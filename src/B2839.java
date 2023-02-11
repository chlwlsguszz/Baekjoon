import java.util.Scanner;

public class B2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bag = 0;
        int n = scanner.nextInt();

        while(n>=3) {
            if (n % 5 == 0) {
                bag += n / 5;
                n = n % 5;
            }
            else {
                n -= 3;
                bag += 1;
            }
        }
        if (n != 0) System.out.println(-1);
        else System.out.println(bag);
    }
}
