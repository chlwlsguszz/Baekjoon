import java.io.*;
import java.util.Arrays;

public class B1026 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        String str[] = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr1[i] = Integer.parseInt(str[i]);
        }

        str = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr2[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int sum=0;
        for(int i=0;i<n;i++) {
            sum += arr1[i] * arr2[n-1-i];
        }
        bw.write(sum+"\n");
        bw.flush();
    }
}
