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
            String s = sc.next();
            StringBuilder sb = new StringBuilder();

            for (char c: s.toCharArray()) {
                if (c == '1')
                    sb.append('0');
                else
                    sb.append('1');
            }
            System.out.println(sb.toString());

        }
    }
}