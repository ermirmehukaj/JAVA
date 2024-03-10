package day13_costumMethods;

public class warmupTasks {

    public static void main(String[] args) {

calculate(200,5,'/');

        System.out.println("-------------------------------------");
        ageGroup(40);
eligibelToVote(15,true);



    }

    public static void calculate(double num1, double num2, char mathOperator) {


        switch (mathOperator) {

            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 + num2));
                break;

            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2));
                break;

            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2));
                break;

            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2));
                break;

            default:
                System.err.println("Invalid operator: "+mathOperator);

        }


    }

public static void ageGroup(int age) {


        if(age >=0  && age <= 150){

            System.out.println(  (age < 21)? "Teenager"  :(age < 55)? "Adult" : "Senior" );

        }else{

            System.err.println("Invalid age: "+age);

        }


    }

    public static void eligibelToVote(int age,boolean isAmerican){

        if(age>21 && isAmerican == true){
            System.out.println("Your eligibel to vote");
        }else {
            System.err.println("you are not eligibel to vote");
        }



    }





}
