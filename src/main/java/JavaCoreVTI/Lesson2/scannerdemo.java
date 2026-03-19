package JavaCoreVTI.Lesson2;

import java.util.Scanner;

public class scannerdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap ho va ten ");
        String name = scanner.nextLine();
        System.out.println("ten la: " + name);

        System.out.println("nhap tuoi cua ban ");
        int age = scanner.nextInt();
        System.out.println("tuoi ban la: " + age);
        System.out.println("ban an com chua");
        Boolean traloi = scanner.nextBoolean();
        System.out.println("traloi = " + traloi);
    }

}
