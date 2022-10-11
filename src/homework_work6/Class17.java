package homework_work6;

import java.util.Scanner;
                         // decimal to binary
public class Class17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int num = scanner.nextInt();
        scanner.close();

        int[]binaryNum = new int[100];
        int i =0;
        while (num>0){
            binaryNum[i]=num % 2;
            num = num /2;
            i++;
        }
        System.out.print("Binary number:");
        for (int j =i -1; j >=0; j--){
            System.out.print(binaryNum[j]);
        }
    }


}