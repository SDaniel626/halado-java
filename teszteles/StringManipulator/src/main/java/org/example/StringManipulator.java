package org.example;

public class StringManipulator {

    public static String reverseString(String input) {

        if (input == null ) {
            throw new NullStringException();
        }

        if (input.trim().isEmpty()) {
            throw new SpaceOnlyException();
        }

        char[] charArray = input.toCharArray();

        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        return new String(charArray);
    }
}
