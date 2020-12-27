/**
 * @author :arjun
 * Project :Data-Structure-Algorithm-Java
 * Date : 2020-12-27
 * Time : 12:54
 */
package java_interview.reverse_integer;
/*Leet code approach to reverse the integer*/
class Reverse_Integer_LeetCode {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Reverse_Integer_LeetCode obj = new Reverse_Integer_LeetCode();

        int result = obj.reverse(-12);
        System.out.println(result);

    }

}