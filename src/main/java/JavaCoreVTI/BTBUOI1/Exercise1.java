package JavaCoreVTI.BTBUOI1;

public class Exercise1 {
    public void question1 (){
        Department department = new Department();
        department.departmentName = "bao ve";
        Account account = new Account();
        account.department = department;
        if(account.department == null ){
            System.out.println("nhan vien nay chua co phong ban");
        } else {
            System.out.println("phong ban cua nhan vien nay la " + account.department.departmentName);
        }
    }
    public void question2(){

    }
}
