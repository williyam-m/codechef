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
            int x = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int ones = 0;
            long inversions = 0;
            for (char c: s.toCharArray()) {
                if (c == '1')
                    ++ones;
                else
                    inversions += ones;
            }
            if (inversions <= x && inversions % k == 0)
                System.out.println(1);
            else
                System.out.println(2);
        }

    }
}