package homework_work6;

import java.util.Scanner;

public class Class13 {
    public static void main(String[] args) {
    int x,y,z;
    double average;
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Enter number 1 for average");
    x = scanner.nextInt();
    System.out.println("Enter number 2 for average");
    y= scanner.nextInt();
    System.out.println("Enter number 3 for average");
    z= scanner.nextInt();

    average=(x+y+z)/3;
        System.out.println("our average is" + average);






    }
}
