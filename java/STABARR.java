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
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = sc.nextInt();
            }
            int maxTime = 0;
            int currMax = arr[n - 1];
            int currTime = 0;

            for (int i = n - 2; i >= 0; --i) {
                if (arr[i] < currMax)
                    ++currTime;
                else {
                    currMax = arr[i];
                    maxTime = Math.max(maxTime, currTime);
                    currTime = 0;
                }
            }
            maxTime = Math.max(maxTime, currTime);
            System.out.println(maxTime);

        }

    }
}