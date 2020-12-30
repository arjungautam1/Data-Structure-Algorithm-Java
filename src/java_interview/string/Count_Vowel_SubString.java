/**
 * @author :arjun
 * Project :Data-Structure-Algorithm-Java
 * Date : 2020-12-29
 * Time : 16:51
 */
package java_interview.string;

import java.util.Scanner;

/*Sumsung Interview Question / Verisk Interview */
public class Count_Vowel_SubString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String string = obj.next();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {

            char c = string.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }

        }

        System.out.println("No of vowels :" + count);

    }
}
