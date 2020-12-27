/**
 * @author :arjun
 * Project :Data-Structure-Algorithm-Java
 * Date : 2020-12-27
 * Time : 10:12
 */
package java_interview.reverse_integer;
/*Java program to reverse the integer*/

public class ReverseInteger {
    public static void main(String[] args) {
        int n=120,rev=0;
        while(n!=0){

            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println("Revered Number is "+rev);
    }

}
