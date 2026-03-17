package JavaCoreVTI.Lesson1.studentDemo;

public class Program {
    public static void main(String[] args) {
        //tao doi tuong student tu thiet ke student
        Student student = new Student();

        //gan gia tri cho thuoc tinh
        student.name = "doan truong duy";
        student.age = 18;

        //truy cap thuộc tính
        System.out.println("student.name = " + student.name);
        System.out.println("student.age = " + student.age);

            //hs tinh tong
        int sum = student.tong(5,2);
        System.out.println("sum = " + sum);

        student.gotoschool();
    }
}
