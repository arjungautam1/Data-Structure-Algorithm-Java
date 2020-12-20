/**
 * @author :arjun
 * Project :Data-Structure-Algorithm-Java
 * Date : 2020-12-20
 * Time : 11:06
 */
package searching_algorithms;

import java.util.Scanner;

public class LinearSearch {
    public static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int arrayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        System.out.print("Given Elements are:");
        int elements = arrayElements(array);

        System.out.print("\n" + "Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int searchElement = sc.nextInt();
        int result = search(array, searchElement);
        if (result == -1)
            System.out.println("Entered Number does not exist in the array");
        else
            System.out.println("Entered number is present in the index :" + result);
    }
}
