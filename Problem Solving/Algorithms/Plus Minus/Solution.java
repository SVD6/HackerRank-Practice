import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ++negatives;
            } else if (arr[i] > 0) {
                ++positives;
            } else {
                ++zeros;
            }
        }

        float posRatio = (float)positives/(float)arr.length;
        float negRatio = (float)negatives/(float)arr.length;
        float zerRatio = (float)zeros/(float)arr.length;

        System.out.println(String.format("%.6f", posRatio));
        System.out.println(String.format("%.6f", negRatio));
        System.out.println(String.format("%.6f", zerRatio));      
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
