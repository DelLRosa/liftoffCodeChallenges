package org.launchcode;

import org.launchcode.ageCompare.Person;

public class Main {
    public static void main(String[] args) {
//
//        System.out.println(AreaChallenge.findArea(3,2));
//        System.out.println(StringReverse.FirstReverse("Hello"));
//        System.out.println(LongestString.findLongestWord("it@$% is ME!!!!!!!, asdfgh#$%^&"));
//        System.out.println(AddNumber.addNumber(4));
//        System.out.println(AddNumber.addNumber(13));
//        System.out.println(AddNumber.addNumber(600));
        Person p1 = new Person("Joey", 27);
        Person p2 = new Person("Bobby", 27);
        Person p3 = new Person("Mandy", 55);
        Person p4 = new Person("Sue", 15);
        System.out.println(p1.compareAge(p2));
        System.out.println(p1.compareAge(p3));
        System.out.println(p1.compareAge(p4));
        System.out.println(p2.compareAge(p4));
    }

}