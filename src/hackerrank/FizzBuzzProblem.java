/**
 * @author :arjun
 * Project :Data-Structure-Algorithm-Java
 * Date : 2020-12-22
 * Time : 16:14
 */

/*Write a short program that prints each number from 1 to 100 on a new line.
For each multiple of 3, print "Fizz" instead of the number.
For each multiple of 5, print "Buzz" instead of the number.
For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.*/

package hackerrank;

public class FizzBuzzProblem {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
