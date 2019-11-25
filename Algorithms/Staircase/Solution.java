import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        for (int i = 1; i < n + 1; i++) {
            String result = "";
            int a = 0;
            int b = 0;
            while (a < (n - i)) {
                result += " ";
                a++;
            }
            while (b < i) {
                result += "#";
                b++;
            }
            if (i == n) {
                System.out.print(result);
            } else {
                System.out.println(result);
            }

        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
