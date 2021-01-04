/**
 * @author :arjun
 * Project :Data-Structure-Algorithm-Java
 * Date : 2020-12-31
 * Time : 20:59
 */

package java_interview.string;

import java.util.HashSet;

//Program to find the vowel substring in java
public class Vowel_String {

    static boolean isVowel(char x) {
        return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u');
    }
    static void findSubString(String str){
        HashSet<Character> hashSet=new HashSet<Character>();

        int start=0;
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))==true){
                hashSet.add(str.charAt(i));

                if(hashSet.size()==5)
                    System.out.println(str.substring(start,i+1)+" ");
            }
            else {
                start=i+1;
                hashSet.clear();
            }
        }
    }

    public static void main(String[] args) {
        String str="aeoibsddaeiouudb";
        findSubString(str);
    }

}
