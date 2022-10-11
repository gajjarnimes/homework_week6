package homework_work6;

import java.util.Scanner;

public class class7 {

    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        float f;
        double cel;
        System.out.println("Enter Temperature Fahrenheit to degree Celsius");
        f=input.nextFloat();
        cel= ((f-32)* 5/9);
        System.out.println("\n Fahrenheit is:"+f);
        System.out.println("\n Celsius is :" +cel);


        }
    }

