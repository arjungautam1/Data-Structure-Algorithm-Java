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
        long rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int) rev;
    }

    public static void main(String[] args) {

        Reverse_Integer_LeetCode obj = new Reverse_Integer_LeetCode();
        System.out.println(obj.reverse(234));
    }
}