package ch10;

public class TypeConversion {

    public static void main(String[] args) {

        byte bNum = 10;
        int iNum = bNum;

        System.out.println("bNum : " + bNum);
        System.out.println("iNum : " + iNum);

        double dNum = 1.2;
        float fNum = 0.9F;

        int INum1 = (int)dNum + (int)fNum;
        int INum2 = (int)(dNum + fNum);

        System.out.println("INum : " + INum1); // 소수점 부분 날라가고 계산
        System.out.println("INum : " + INum2); // 계산 후 소수점 부분 날라감

    }

}
