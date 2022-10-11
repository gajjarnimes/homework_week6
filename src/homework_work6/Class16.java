package homework_work6;

import java.util.Scanner;

public class Class16 {
    public static String add(String num1, String num2){
        // convert binary string to decimal number
        int num1Binary = Integer.parseInt(num1,2);
        // convert binary string to decimal number
        int num2Binary = Integer.parseInt(num2,2);
        // Add two decimal numbers
        int sumofNumbers = num1Binary + num2Binary;
        // convert decimal to binary and return
        return Integer.toBinaryString(sumofNumbers);

    }

    public static void main(String[] args) {
        try (Scanner scanner= new Scanner(System.in)){
            //10
            System.out.println("Enter first binary number:");
            String number1 = scanner.next();
            //11
            System.out.println("Enter second binary number:");
            String number2 = scanner.next();
            System.out.println("Sum of numbers:"+ add(number1,number2));

        }
    }




}
