package java_interview.string;// Java program to find all substring that
// contain all vowels
import java.util.HashSet;

public class Vowel_String {

    // Returns true if x is vowel. 
    static boolean isVowel(char x) {
        // Function to check whether a character is
        // vowel or not
        return (x == 'a' || x == 'e' || x == 'i'
                || x == 'o' || x == 'u');
    }

    static void findSubstring(String str) {
        HashSet<Character> hash = new HashSet<Character>();
        // To store vowels

        // Outer loop picks starting character and
        // inner loop picks ending character.
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                // If current character is not vowel,
                // then no more result substrings
                // possible starting from str[i].
                if (isVowel(str.charAt(j)) == false)
                    break;

                // If vowel, then we insert it in hash
                hash.add(str.charAt(j));

                // If all vowels are present in current
                // substring
                if (hash.size() == 5)
                    System.out.print(str.substring(i, j + 1) + " ");
            }
            hash.clear();
        }
    }

    // Driver code
    public static void main(String[] args) {
        String str = "aeoibsddaeiouudb";
        findSubstring(str);
    }
}
