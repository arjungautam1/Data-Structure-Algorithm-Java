package java_interview.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        int num = 10, rev = 0;
        int originalInt = num;

        while (num != 0) {
            int remainder = num % 10;
            rev = num * 10 + remainder;
            num = num / 10;
        }
        if (originalInt == rev)
            System.out.println("Number is Palindrome.");
        else
            System.out.println("Number is not Palindrome");
    }
}
