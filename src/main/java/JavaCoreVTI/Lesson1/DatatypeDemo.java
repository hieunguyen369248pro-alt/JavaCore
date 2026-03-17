package JavaCoreVTI.Lesson1;

import JavaCoreVTI.Lesson1.studentDemo.Gender;

import java.time.LocalDate;

public class DatatypeDemo {
    public static void main(String[] args) {
        int age = 18;
        System.out.println("age = " + age);
        float score = 9.5f;
        System.out.println("score = " + score);
        boolean load = true;
        System.out.println("load = " + load);
        char kitu = 'a';
        System.out.println("kitu = " + kitu);
        String chuoi = "abc";
        System.out.println("chuoi = " + chuoi);
        //kieu thoi gian
        LocalDate ngay = LocalDate.now();
        System.out.println("ngay = " + ngay);
        //kieu enum
        Gender gender = Gender.MALE;
        System.out.println("gender = " + gender);
        //kieu mang: array
        int[] mang = {1, 2, 3, 5};
        System.out.println("mang = " + mang[1]);
        System.out.println("mang.length = " + mang.length);
        String[] traicay = new String[]{"tao","cam","oi"};
        System.out.println("traicay = " + traicay[2]);
        System.out.println("traicay.length -1= " + traicay[traicay.length-1]);
    }
}
