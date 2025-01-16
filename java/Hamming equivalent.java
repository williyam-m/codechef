import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int[] p = new int[n];

            for (int i = 0; i < n; ++i) {
                p[i] = sc.nextInt();
            }
            if (check(p, n))
                System.out.println("yes");
            else 
               System.out.println("no");
        }
	}
	public static boolean check (int[] p, int n) {
	    for (int i = 0; i < n; ++i) {
	        if (Integer.bitCount(p[i]) != Integer.bitCount(i + 1))
	           return false;
	    }
	    return true;
	}
}
