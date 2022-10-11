package homework_work6;

public class Class5 {
    int a = 10;
    int b = 15;
    static int x = 20;
    static int y = 25;

    public static void main(String[] args) {
        Class5 obj = new Class5();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println("a" + "+" + "b " + " = " + (obj.a + obj.b));
        System.out.println("b" + "- a =" + (obj.b - obj.a));
        System.out.println("x" + "*" + "y=" + (x * y));
        System.out.println("y" + "/" + "x=" + (y / x));
    }

    //instance
    public void myadd() {
        System.out.println(a);
    }

    // instance
    public void mysub() {
        System.out.println(b);
    }

    // static
    public static void mydiv() {
        System.out.println(x);

    }

    // static
    public static void mymul() {
        System.out.println(y);
    }
}
