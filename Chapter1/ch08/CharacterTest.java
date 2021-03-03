package ch08;

public class CharacterTest {

    public static void main(String[] args) {

        char ch1 = 'A';
        System.out.println(ch1); // A
        System.out.println((int)ch1); // 65

        char ch2 = 66;
        System.out.println(ch2); // B

        int ch3 = 67;
        System.out.println(ch3); // 67
        System.out.println((char)ch3); // C

        //char ch4 = -66;  음수는 대입 할 수 없음

        char ch5 = '한';
        char ch6 = '\uD55C'; //16진수로 

        System.out.println(ch5); // 한
        System.out.println(ch6); // 한
    }
}
