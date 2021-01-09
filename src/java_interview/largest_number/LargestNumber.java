/**
 * @author :arjun
 * Project :Data-Structure-Algorithm-Java
 * Date : 2021-01-09
 * Time : 12:42
 */
package java_interview.largest_number;

import java.util.Scanner;

/*Java program to find largest number in an array*/
public class LargestNumber {
    public static void main(String[] args) {
        int num,max;
        System.out.println("Enter the number of elements in an array");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int a[] = new int[num];

        System.out.println("Elements in the array: ");
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        max=a[0];
        for(int i=0;i<num;i++){

            if(max<a[i])
            {
                max=a[i];

            }

        }
        System.out.println("Maximum value in the array: "+max);




    }
}
