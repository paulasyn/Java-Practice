import java.util.*;
import java.io.*;
import java.net.ConnectException;

public class numToWord{

    public static String conversionNumToWord(int input){

        String wordNum = "";
        String[] onesPlace = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tensPlace = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] special = {"", "", "hundred", "thousand", "thousand", "hundred thousand", "one million"};

        // base case
        if ( input == 0){
            return "zero";
        }

        // 1 to 19
        if ( input > 0 && input < 20 ){
            wordNum = onesPlace[input];
        }

        // 20 to 99
        if ( input > 19 && input < 100 ){
            int tens, ones;
            tens = input/10;
            ones = input%10;
            if ( ones == 0 ){
                wordNum = tensPlace[tens];
            }
            else {
                wordNum = tensPlace[tens] +  " " + onesPlace[ones];
            }
        }

        // 100 to 999
        if ( input > 99 && input < 1000){
            int hundreds, tens, ones;
            hundreds = input/100;
            tens = input%100/10;
            // why tho?
            ones = input%10;
            if ( input%100 == 0){
                wordNum = onesPlace[hundreds] + " hundred";
            }
            else{
                wordNum = onesPlace[hundreds] + " hundred " + tensPlace[tens] + " " + onesPlace[ones];
            }
        }
        return wordNum;
    }  
        
        // *** OR BETTER *** //

    public static String conversionNumToWordDynamic(int input){

        String wordNum = "";
        String[] onesPlace = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tensPlace = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] special = {"", "", "hundred", "thousand", "thousand", "hundred thousand", "one million"};

        // base case
        if ( input == 0){
            return "zero";
        }

        // 1 to 19
        if ( input > 0 && input < 20 ){
            wordNum = onesPlace[input];
        }

        // 20 to 99
        if ( input > 19 && input < 100 ){
            int tens, ones;
            tens = input/10;
            ones = input%10;
            if ( ones == 0 ){
                wordNum = tensPlace[tens];
            }
            else {
                wordNum = tensPlace[tens] +  " " + conversionNumToWordDynamic(ones);
            }
        }

        // 100 to 999
        if ( input > 99 && input < 1000){
            int hundreds, tens, ones;
            hundreds = input/100;
            tens = input%100;
            ones = input%10;
            if ( input%100 == 0){
                wordNum = onesPlace[hundreds] + " hundred";
            }
            else{
                wordNum = onesPlace[hundreds] + " hundred " + conversionNumToWordDynamic(tens);
            }
        }
        return wordNum;
     }

    public static void main(String[] args){
        int input = 19;
        String wordNum;
        wordNum = conversionNumToWord(input);
        System.out.println(input + " : " + wordNum);

        input = 9;
        wordNum = conversionNumToWord(input);
        System.out.println(input + " : " + wordNum);

        input = 17;
        wordNum = conversionNumToWord(input);
        System.out.println(input + " : " + wordNum);

        input = 99;
        wordNum = conversionNumToWord(input);
        System.out.println(input + " : " + wordNum);

        input = 333;
        wordNum = conversionNumToWord(input);
        System.out.println(input + " : " + wordNum);

        System.out.println("*** DYNAMIC ***");

        input = 0;
        wordNum = conversionNumToWordDynamic(input);
        System.out.println(input + " : " + wordNum);

        input = 9;
        wordNum = conversionNumToWordDynamic(input); 
        System.out.println(input + " : " + wordNum);

        input = 17;
        wordNum = conversionNumToWordDynamic(input);
        System.out.println(input + " : " + wordNum);

        input = 99;
        wordNum = conversionNumToWordDynamic(input);
        System.out.println(input + " : " + wordNum);

        input = 333;
        wordNum = conversionNumToWordDynamic(input);
        System.out.println(input + " : " + wordNum);
    }
}