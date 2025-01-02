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
		while (t-- > 0) {
        	int n = sc.nextInt();
        	int[] b = new int[n - 1];
        	for (int i = 0; i < n - 1; ++i)
        	    b[i] = sc.nextInt();
        	Arrays.sort(b);
        	int[] a = new int[n];
        	a[0] = b[0] / 2;
        	a[1] = (b[0] + 1) / 2;
        	for (int i = 2; i < n; ++i) {
        	    a[i] = b[i - 1] - a[i - 1];
        	}
        	for (int i = 0; i < n; ++i) 
        	   System.out.print(a[i] + " ");
           System.out.println();
		}

	}
}
