package org.gspann.com.program;

public class ReverseStringUsingCharArray {

    public static String reverseStringUsingCharacterArray(String str) {

// Convert the string to a character array
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters from the ends towards the center
        while (left < right) {
            // Swap the characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            // Move towards the center
            left++;
            right--;
        }

        // Create a new string from the reversed character array
        return new String(charArray);
    }
}