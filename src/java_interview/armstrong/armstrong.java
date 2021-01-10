/**
 * @author :arjun
 * Project :Data-Structure-Algorithm-Java
 * Date : 2021-01-10
 * Time : 06:28
 */
package java_interview.armstrong;

/* 1^3+5^3+3^3=153 , 370*/
public class armstrong {
    public static void main(String[] args) {

        int originalNumber = 154, remainder, result = 0;
        int num=originalNumber;
        while (num != 0) {
            remainder = num % 10;
            result += Math.pow(remainder, 3);
            num/=10;
        }
        if(originalNumber==result)
            System.out.println(originalNumber+" is armstrong number");
        else
            System.out.println(originalNumber+" is not armstrong number");


    }
}
