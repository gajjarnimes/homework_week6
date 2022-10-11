package homework_work6;

public class Class4 {
    int a = 10;
    int b = 20;
    String Name = "Dan";
    String string = "jack";
    public static void main(String[] args) {
        Class4 obj = new Class4();
        System.out.println(obj.a);
        System.out.println(obj.b);
        Name();
    }
    //instance method
    public void Class4(){
        System.out.println(a);
        System.out.println(b);
    }
    // static method
    public static void Name(){
        System.out.println("Dan");
        System.out.println("Jack");
    }
}
