package homework_work6;

import java.util.Scanner;

public class Class18 {
    int a = 125;
    int b = 24;
    public static void main(String [] args){
        int first, second, add, subtract, multiply;
        float devide;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Two Numbers : ");
        first = scanner.nextInt();
        second = scanner.nextInt();

        add = first + second;
        subtract = first - second;
        multiply = first * second;
        devide = (float) first / second;

        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + devide);

        float  remainder=(125%24);
        System.out.println("remainder = "+ remainder);

    }

}
