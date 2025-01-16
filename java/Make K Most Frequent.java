import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int[] count = new int[21];

            for (int i = 0; i < n; ++i) {
                arr[i] = sc.nextInt();
                ++count[arr[i]];
            }
            if (max(count, k) == k)
                System.out.println(0);
            else {
                Arrays.fill(count, 0);
                boolean flag = false;

                for (int i = 0; i < n; ++i) {
                    ++count[arr[i]];
                    if (count[k] == 0)
                        continue;
                    if (check(count, k)) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    Arrays.fill(count, 0);
                    for (int i = n - 1; i >= 0; --i) {
                        ++count[arr[i]];
                        if (count[k] == 0)
                            continue;
                        if (check(count, k)) {
                            flag = true;
                            break;
                        }
                    }
                }
                if (flag)
                    System.out.println(1);
                else
                    System.out.println(2);
            }
        }
    }
    public static boolean check(int[] count, int k) {
        for (int i = 1; i < 21; ++i) {
            if (count[k] < count[i]) {
                return false;
            }
        }
        return true;
    }
    public static int max(int[] count, int k) {
        int max = 0;
        int index = 0;
        for (int i = 1; i < 21; ++i) {
            if (max < count[i]) {
                max = count[i];
                index = i;
            }
        }
        if (count[k] == max)
            return k;
        return index;
    }
}