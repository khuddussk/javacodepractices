package org.gspann.com.program;

public class StringReverse {




    public static String  calulateReverseString(String str) {

        String reverseString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            reverseString = reverseString + c;
        }
        return reverseString;
    }
}
