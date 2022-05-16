import java.io.FileWriter;
import java.io.IOException;

public class J12 {
    public static void main(String[] args) throws IOException {
        System.out.println(Math.PI); // math라는 클래스에 PI라는 변수가 있다.~
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8)); //올림

        FileWriter f1 = new FileWriter("data.txt");//어떤 정보를 파일에 기록할때 사용하는 클래스인데, 앞에 new를 붙여서 f1에 복제한것인데 이 복제본은 data.txt에 값을 저장하겠다 라는 상태를 가지고 있는 복제본
        f1.write("hello\n");
        f1.write("java");


        FileWriter f2 = new FileWriter("data2.txt");//어떤 정보를 파일에 기록할때 사용하는 클래스인데, 앞에 new를 붙여서 f1에 복제한것인데 이 복제본은 data.txt에 값을 저장하겠다 라는 상태를 가지고 있는 복제본
        f2.write("hello\n");
        f2.write("java2");
        f2.close(); // 파일작업을 끝냈다

        f1.write("!!!");
        f1.close();//f1이라는 filewrite의 복제본은 이렇게 close를 뒤로빼면서 긴~ 입력작업을 할수도있다.

    }
}
