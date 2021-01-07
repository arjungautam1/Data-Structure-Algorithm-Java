package leetcode;

/*
Determine whether an integer is a palindrome.
An integer is a palindrome when it reads the same backward as forward.
 Follow up:
 Could you solve it without converting the integer to a string?
*/
class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;
        while (x > 0) {
            int r = x % 10;
            reverse = reverse * 10 + r;
            x = x / 10;
        }
        if (temp == reverse)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(313));
    }
}

