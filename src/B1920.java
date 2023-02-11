import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class B1920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int srcCount = scanner.nextInt();

        int srcArray[] = new int[srcCount];

        for(int i=0;i<srcCount;i++)
            srcArray[i] = scanner.nextInt();
        Arrays.sort(srcArray);

        int destCount = scanner.nextInt();

        int destArray[] = new int[destCount];

        for(int i=0;i<destCount;i++)
            destArray[i] = scanner.nextInt();

        for(int i=0;i<destCount;i++) {
            int flag = 0;
            if(binarySearch(srcArray, destArray[i]) >= 0) {
                flag = 1;
            }
            System.out.println(flag);
        }
    }
}