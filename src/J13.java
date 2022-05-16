class Print {
    public String delimiter = "";

    public void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A\n");
    }

    public void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B\n");
    }
}

public class J13 {

    public static void main(String[] args) {
        Print p1 = new Print();
        p1.delimiter = "!!!!";

        p1.A();
        p1.A();
        p1.B();
        p1.B();

        Print p2 = new Print();
        p2.delimiter = "----";

        p2.A();
        p2.A();
        p2.B();
        p2.B();

        p1.A();
        p2.A();
        p1.A();
        p2.A();

    }
}
