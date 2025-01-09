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
            String s1 = sc.next();
            String s2 = sc.next();
            flag = false;
            dfs(s1, s2, 0, 0, n);
            if (flag)
                System.out.println("yes");
            else
                System.out.println("no");

        }

    }
    public static boolean flag = false;
    public static void dfs(String s1, String s2, int count, int i, int n) {
        if (flag)
            return;
        if (n == i) {
            if (count % 2 == 1)
                flag = true;
            return;
        }

        dfs(s1, s2, process(count, s1, i), i + 1, n);
        dfs(s1, s2, process(count, s2, i), i + 1, n);
    }
    public static int process(int count, String s, int i) {
        count += s.charAt(i) == '1' ? 1 : 0;
        return count;
    }
}