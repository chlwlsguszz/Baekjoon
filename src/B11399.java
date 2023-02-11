import java.util.Arrays;
import java.util.Scanner;

public class B11399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int sum = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++)
                sum+=arr[j];
        }

        System.out.println(sum);
    }
}
