package ch10;

public class ConstantTest {

    public static void  main(String[] args) {

        final int MAX = 100;
        final int MIN;

        // MAX = 20; 이미 상수로 정해진건 변경이 불가능하다.
        MIN = 0;

        System.out.println(MAX);
        System.out.println(MIN);

    }
}
