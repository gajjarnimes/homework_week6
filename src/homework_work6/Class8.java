package homework_work6;




;
import java.util.Scanner;

public class Class8 {
    public static void main(String[] args) {
        int base = 0;
        int height = 0;
        int area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of  base of Triangle");
        base= scanner.nextInt();
        System.out.println("Enter the length of height of Triangle");
        height= scanner.nextInt();
        // area= (base*height)/2;
        area = (base*height)/2;
        System.out.println("The are of Triangle"+ area);





    }
}
