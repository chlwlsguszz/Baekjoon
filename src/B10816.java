import java.io.*;
import java.util.HashMap;

public class B10816 {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            int val = Integer.parseInt(arr[i]);
            if(hashMap.containsKey(val)) {
                hashMap.put(val, hashMap.get(val)+1);
            }
            else
                hashMap.put(val, 1);
        }

        int m = Integer.parseInt(br.readLine());
        String[] arr2 = br.readLine().split(" ");
        for(int i=0;i<m;i++) {
            int val = Integer.parseInt(arr2[i]);
            if(hashMap.get(val)==null)
                bw.write(String.valueOf(0)+" ");
            else
                bw.write(hashMap.get(val)+" ");
        }
        bw.write("\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
