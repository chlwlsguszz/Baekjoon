import java.util.Scanner;

public class B2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int max = 0;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if(max < arr[i])
                max = arr[i];
        }

        int left = 0;
        int right = max;
        int mid=0;

        while (left <= right) {

            long treeSum=0;
            for(int tree : arr) {
                if(tree > mid)
                    treeSum += tree - mid;
            }
            if (treeSum >= m) left = mid + 1;
            else right = mid - 1;
            mid = (left + right) / 2;
        }

        System.out.println(mid);
    }
}
