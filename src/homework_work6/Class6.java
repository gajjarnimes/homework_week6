package homework_work6;

import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
        double radius, area;
        Scanner input = new Scanner((System.in));
        System.out.println(" Enter any radius value of the circle");
        radius = input.nextDouble();
        input.close();

        area = Math.PI * radius * radius;
        System.out.println("Area of the circle" + area);


    }

}
