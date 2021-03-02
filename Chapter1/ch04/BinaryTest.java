package ch04;

public class BinaryTest {
    public static void main(String[] args){

        int num = 10; // 10진수
        int bNum = 0B1010; // 2진수 (식별자 : 0B)
        int oNum = 012; // 8진수 (식별자 : 0)
        int xNum = 0XA; // 16진수 (식별자 : 0X)

        System.out.println("10진수 출력: " + num);
        System.out.println("2진수 출력: " + bNum);
        System.out.println("8진수 출력: " + oNum);
        System.out.println("16진수 출력: " + xNum);

    }

}
