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
            int p = sc.nextInt();
            int k = sc.nextInt();
            int ans = 0;
            int x = (p % k);
            int y = (n - 1) - ((n - 1) / k) * k;
            if (x > y) {
                ans = x * ((n - 1) / k) + (y + 1);
            }
            else {
                ans = x * (((n - 1) / k) + 1);
            }
            
            for (int j = x; j < n; j += k) {
                ++ans;
                if (j == p) {
                    break;
                }
            }
            System.out.println(ans);

        }
	}
}
