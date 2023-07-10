package org.launchcode;

import java.lang.reflect.Array;

public class StringReverse {
    public static String FirstReverse(String str) {
        String reverseString = "";
        for(int i=0; i<str.length(); i++)
            reverseString=str.charAt(i) + reverseString;
        return reverseString;
    }
}
