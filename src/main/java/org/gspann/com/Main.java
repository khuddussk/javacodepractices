package org.gspann.com;

import org.gspann.com.program.StringReverse;

import static org.gspann.com.program.ReverseStringUsingCharArray.reverseStringUsingCharacterArray;
import static org.gspann.com.program.ReverseStringUsingStringBuilder.reverseString;
import static org.gspann.com.program.StringReverse.calulateReverseString;

public class Main {
    public static void main(String[] args) {
        //1. calculate reverse string
        System.out.println("Reverse String Using reverse loop >>>>>>>" + calulateReverseString("Hello World"));


        //2. calulating reverse string using string builder

        String input = "Hello ";
        String reversed = reverseString(input);
        System.out.println("Reversed String Using String Builder: " + reversed);


        // 3. reverse string using character array

        String strInput = "Java Guides New";
        String reversedStr = reverseStringUsingCharacterArray(strInput);
        System.out.println("Reversed String character Array : " + reversedStr);

    }
}