import java.io.*;
import java.util.HashSet;

public class B10815 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashSet<Integer> hashSet = new HashSet<>();

        String str[] = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            hashSet.add(Integer.parseInt(str[i]));

        }

        int m = Integer.parseInt(br.readLine());

        str = br.readLine().split(" ");
        int arr2[] = new int[m];
        for(int i=0;i<m;i++) {
            arr2[i] = Integer.parseInt(str[i]);
        }

        for(int i=0;i<m;i++) {
            if(hashSet.contains(arr2[i]))
                bw.write("1 ");
            else
                bw.write("0 ");
        }
        bw.write("\n");
        bw.flush();
    }
}
