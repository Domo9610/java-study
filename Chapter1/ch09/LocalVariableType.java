package ch09;

public class LocalVariableType {

    public static void main (String[] args) {

        //var --> variable의 약자
        var i = 10; // 정수(int)
        var j = 10.0; // 실수(double)
        var str = "Hello"; // 문자열(String)

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        var str2 = str;
        System.out.println(str2);

        str = "test";
        System.out.println(str);
        //str = 3; *오류: 데이터 형이 다름 str은 문자열이지만 정수형으로 바꾸기 xxxx

    }
}
