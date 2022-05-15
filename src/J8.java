public class J8 {


    public static void main(String[]/*문자열배열*/ args) {

        printTwoTimes("B"/* 인자, argument*/,"-");


    }
    public static void printTwoTimes(String text/* 메소드안으로 정보는 보내는 매개변수, parameter*/, String delimiter) {

        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
}
