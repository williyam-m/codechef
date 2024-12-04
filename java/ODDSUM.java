import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
        	long n = Integer.parseInt(br.readLine());
        	if (n == 1 || n == 2)
        	   pw.println(1);
        	else
              pw.println(((n - 2) * (n - 1)) + 1);
		}
		pw.flush();
	}
}
