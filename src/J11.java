public class J11 {
    public String delimiter;
    public void a() {
        System.out.println(this.delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    public void b() {
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }

    public static void main(String[] args) {
//        J11.a("-");
//        J11.b("-");
        J11 t1 = new J11();
        t1.delimiter = "-";
        t1.a();
        t1.b();

        // 인스턴스 t1의 delimiter변수값을 *로 지정
        J11 t2 = new J11();
        t2.delimiter = "*";
        t2.a(); //메소드가 인스턴스 (J11 t2 = new J11();) t1의 소속일땐 static을 지워야함! 클래스소속일땐 static을 붙여야함.
        t2.b();

//        static - class method
//        no static - instance method

    }
}
