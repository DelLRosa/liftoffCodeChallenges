package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LongestString {
    public static String findLongestWord(String string) {
        String longestWord="";
        int wordCount=0;
//        String word = "!Words word! ";
        string = string.replaceAll("\\p{Punct}", "");
        System.out.println(string);
        String [] strArray=string.split("\\s");
        for (int i=0; i<strArray.length; i++){
            if (strArray[i].length() > longestWord.length()){
                longestWord=strArray[i];
            }
        }
        return longestWord;
    }
}
