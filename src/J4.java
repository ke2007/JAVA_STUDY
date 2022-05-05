import java.util.Scanner;

public class J4 {
    public static void main(String[] args) {
        String name;
        int age;
        String gender;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("please type your name and age your gender: ");

        name = keyboard.next();
        age = keyboard.nextInt();
        gender = keyboard.next();

        if (gender.equals("male")) {
            System.out.println(name + ", you're " + age + "years old man.");
        } else if (gender.equals("female")) {
            System.out.println(name + ", you're" + age + "years old woman.");
        } else {
            System.out.println("Hmm..interesting");
        }
        keyboard.close();
    }
}
