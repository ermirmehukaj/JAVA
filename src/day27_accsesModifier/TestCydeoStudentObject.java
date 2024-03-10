package day27_accsesModifier;

public class TestCydeoStudentObject {


    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Ekatarina",29,'F');
        CydeoStudent student2 = new CydeoStudent("Alena",28,'F');

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(CydeoStudent.schoolName);

        System.out.println(student2.secretCode);
        System.out.println(student1.secretCode);

        System.out.println(student2.schoolName);
        System.out.println(student1.schoolName);




    }


}
