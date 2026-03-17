package JavaCoreVTI.Lesson1;

public class switchCaseDemo
{
    public static void main(String[] args) {
        int month = 6;
        switch (month){
            case 1:
                System.out.println("co 31 ngay");
                break;
            case 2:
                System.out.println("co 28 ngay");
                break;
            case 3:
                System.out.println("30 ngay");
            case 4:
                System.out.println("23 ngay");
            default:
                System.out.println("30 ngay");
        }
    }
}
