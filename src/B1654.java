import java.io.*;

public class B1654 {

    public static long binarySearch(long arr[], int n, long max) {
        long mid = 0;
        long min = 1;

        while(min <= max) {
            mid = (min + max) / 2;
            long count = 0;

            for (long num : arr) {
                count += num / mid;
            }

            if (count < n) {
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }
        }
        return (max+min)/2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s[] = br.readLine().split(" ");
        int k = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);

        long arr[] = new long[k];
        long max = 0;
        for(int i=0;i<k;i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        bw.write(binarySearch(arr, n, max)+"\n");
        bw.flush();
    }
}
