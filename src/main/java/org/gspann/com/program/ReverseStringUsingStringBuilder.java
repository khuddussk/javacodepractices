package org.gspann.com.program;

public class ReverseStringUsingStringBuilder {

    public static String reverseString(String str) {

        StringBuilder sb= new StringBuilder();


        for (int i = str.length()-1; i >=0 ; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }


}
