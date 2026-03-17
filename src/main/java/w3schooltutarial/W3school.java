package w3schooltutarial;

import java.util.Scanner;

public class W3school {
    public static void main(String[] args) {
        int x ,y, tong;
        Scanner obj  = new Scanner(System.in);
        System.out.println("nhap x = ");
        x = obj.nextInt();

        System.out.println("nhap y = ");
        y = obj.nextInt();

        tong = x + y;
        System.out.println("tong la: " + tong);

        int a = 5;
        int b =7;
        int temp = a;
        a = b ;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int n = 5;
        if( n % 2 == 0){
            System.out.println("n la so chan ");
        }else{
            System.out.println("n la  so le");
        }

        int bien = 1234;
        int daonguoc = 0;

        while (bien != 0){
            int  chuoi = bien %  10;
            daonguoc = daonguoc * 10 +chuoi;
            bien /=  10;

        }
        System.out.println("chuoi sau khi dao nguoc " + daonguoc);
        int m = 10 ;
        if(m > 0){
            System.out.println("m la duong");
        }else{
            System.out.println("m la am");
        }
        System.out.println(Math.sqrt(64));
        int chieudai = 4;
        int chieurong = 5;
        int chuvi = chieudai * chieurong;
        System.out.println("chu vi hcm la "+ chuvi);
        //do c sang do f
        int DoC = 38;
        int Dof = DoC * 9 / 5 +32;
        System.out.println("do c = " + DoC + "do f = " +Dof );
    }

}
