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
            int max = 0;
            for (int i = 0; i < n; ++i) {
                if (max == 10)
                    System.out.print(0 + " ");
                else {
                    int curr = sc.nextInt();
                    if (curr > max) {
                        max = curr;
                        System.out.print(1 + " ");
                    }
                    else
                        System.out.print(0 + " ");
                }
            }
            System.out.println();

        }

    }
}