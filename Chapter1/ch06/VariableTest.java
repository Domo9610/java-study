package ch06;

public class VariableTest {

    public static void main(String[] args) {

        byte bnum = -128;
        System.out.println("byte :" + bnum);

        // int num = 12345679000; *오류 : int가 표현할수 있는 범위를 넘어섬
        // long Lnum = 1235679000; *오류 : long변수 초기화시에는 뒤에 l,L을 붙여줘야함 한다.

        long LNum = 1234567900L;
        System.out.println("long :" + LNum);

    }

}
