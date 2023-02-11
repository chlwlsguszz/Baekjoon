import java.io.*;

public class B11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count=0;
        for(int i=n-1;i>=0;i--) {
            while(arr[i]<=k) {
                k = k-arr[i];
                count++;
            }
            if(k==0) break;
        }

        bw.write(String.valueOf(count)+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
