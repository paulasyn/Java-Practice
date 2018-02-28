import java.util.*;
import java.io.*;

public class StringManips{

    public static void verifyPalindromeStack(String input){
        boolean isPalindrome = true;
        Stack palStack = new Stack();
        int strLen = input.length();
        String lowerInput = input.toLowerCase();
        String reverseString = "";
        int i = 0;
        while(i < (strLen) ) {
            palStack.push(lowerInput.charAt(i));
            i++;
        }
        while( !palStack.isEmpty() ) {
            reverseString = reverseString + palStack.pop();
        }

        if ( !lowerInput.equals(reverseString) ){
            isPalindrome = false;
        }

        System.out.println(input + " is a palindrome: " + isPalindrome);
    }

    public static void verifyPalindromeReverse(String input){
        boolean isPalindrome = true;
        String lowerInput = input.toLowerCase();
        String newReverseString;
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(lowerInput);
        reverseString.reverse();
        newReverseString = reverseString.toString();

        if ( !lowerInput.equals(newReverseString) ){
            isPalindrome = false;
        }
        
        System.out.println(input + " is a palindrome: " + isPalindrome);
    }

    public static void main(String[] args){
        String inputString = "thisisnotapalindrome";
        String inputString2 = "EvilOlive";
        verifyPalindromeStack(inputString);
        verifyPalindromeStack(inputString2);     
        verifyPalindromeReverse(inputString);
        verifyPalindromeReverse(inputString2);    
    }
}
