package day09_scaner;

public class NumberOfDays {
    public static void main(String[] args) {
        int month = 3;

        String result = "";
        switch (month){
            case 2: result="28 days";

            case 1: case 3: case 5: case 7: case 10: case 12: case 8:
            result = "31 days";
               break;
            case 4:
            case 6:
            case 9:
            case 11:
            result = "30 days";
             break;
            default:
                result = "invalid number ";
        }


        System.out.println(result);



    }
}
