import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void validate(int n) {
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n <= 5 && n > -2) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && n <= 20 && n >= 6) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        validate(N);
        scanner.close();
    }
}
