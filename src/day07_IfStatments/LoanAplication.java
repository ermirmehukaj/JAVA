package day07_IfStatments;

public class LoanAplication {
    public static void main(String[] args) {
        int salary = 30;
        int creditScore = 700;

        if(salary >= 55 && creditScore >= 700){
            System.out.println("is eligible");
        }else{
            System.out.println("not eligible");
        }
    }
}
