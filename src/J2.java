import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        String id = "racoon";
        String inputId = args[0];

        String PW = "1111";
        String inputPW = args[1];

        System.out.println("hi racoon");

        if (inputId.equals(id) && inputPW.equals(PW)) {
            System.out.println("master!");
        } else {
            System.out.println("Who are you?");
        }
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//
//        System.out.println(i*1000);
//        sc.close();
    }
}
