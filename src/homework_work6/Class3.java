package homework_work6;

import javax.naming.Name;

public class Class3 {
    int a = 10;
    String Name = "Nimesh";

    public static void main(String[] args) {
       Class3 obj = new Class3();
        System.out.println(obj.a);
        Name();
    }

    //instance method
    public void myClass3() {
        System.out.println(a);
    }
    //static method
    public static void Name(){
        System.out.println("Nimesh");
    }
}
