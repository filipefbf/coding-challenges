package com.filipeferreira.coding_interview_challenges;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("Filipe Ferreira"));
        System.out.println(reverseStringWithoutBuiltInMethods("Filipe Ferreira"));
        System.out.println(reverseStringWithoutBuiltInMethods2("Filipe Ferreira"));
    }

    // Reverse a string with built-in Java methods
    private static String reverseString(String s) {
        var stringBuffer = new StringBuffer(s);
        return stringBuffer.reverse().toString();
    }

    // Reverse a string without using built-in Java methods #1
    private static String reverseStringWithoutBuiltInMethods(String s) {
        var reversedString = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString.append(s.charAt(i));
        }
        return reversedString.toString();
    }

    // Reverse a string without using built-in Java methods #2 Swapping characters
    private static String reverseStringWithoutBuiltInMethods2(String s) {
        char[] characters = s.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
        return new String(characters);
    }

}
