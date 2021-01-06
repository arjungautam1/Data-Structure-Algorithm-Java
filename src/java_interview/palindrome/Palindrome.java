package java_interview.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        int n=456,sum=0;
        int temp=n;
        while(n>0){
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

    }
}
