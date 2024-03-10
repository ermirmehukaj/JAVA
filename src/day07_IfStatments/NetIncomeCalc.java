package day07_IfStatments;

public class NetIncomeCalc {
    public static void main(String[] args) {
        int salary = 115000;
        boolean isMaried = true;
        double taxRate = 0;
        if(salary >= 130000){
            taxRate = 0.35;
        }if(salary>= 100000 && salary<=129000){
            taxRate = 0.3;
        }if(salary >= 80000 && salary<= 99000){
            taxRate = 0.25;
        }if(salary<= 79000){
            taxRate = 0.2;
        }if(isMaried){
            taxRate -= 0.05;
        }
        double totalTax = salary * taxRate;
        double netIncome = salary - totalTax;
        System.out.println(totalTax);
        System.out.println(netIncome);

    }

}
