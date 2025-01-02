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
        	int sum = 0;
        	for (int i = 0; i < n; ++i)
        	    sum += sc.nextInt();
        	int need = (n + 1) * 50;
        	if (sum >= need)
        	   System.out.println(0);
        	else if (need - sum >= 0 && need - sum <= 100)
        	   System.out.println(need - sum);
        	else
               System.out.println(-1);
		}
	}
}
