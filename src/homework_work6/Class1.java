package homework_work6;

public class Class1 {
    int a = 20;
    int b = 30;

    public static void main(String[] args) {
        Class1 obj = new Class1();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.myMethod();

    }

    public void myMethod() {
        System.out.println("a");
        System.out.println("b:");
    }
}
