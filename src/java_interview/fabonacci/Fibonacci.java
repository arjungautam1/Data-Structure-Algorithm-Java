/**
 * @author Arjun Gautam
 * Project :Data-Structure-Algorithm-Java
 * Date : 2021-01-22
 * Time : 12:19
 */
package java_interview.fabonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, first = 0, next = 1;
        System.out.println("Enter how many fibo numbers to print:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("The first " + n + "Fibonacci numbers are:");
        System.out.println(first + " " + next);
        for (int i = 1; i < n - 2; ++i) {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.println(" " + sum);
        }
    }

}
