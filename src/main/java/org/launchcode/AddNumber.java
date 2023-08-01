package org.launchcode;

public class AddNumber {
    public static int addNumber(int number){
        int sum=0;
        while (number>0){
            sum+=number;
            number-=1;
        }
        return sum;
    }
}
