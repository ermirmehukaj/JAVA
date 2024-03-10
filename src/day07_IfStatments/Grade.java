package day07_IfStatments;

public class Grade {
    public static void main(String[] args) {
        char letter = 'B';
        String result = "";
                if(letter == 'A' ){
                    result = "Excellent";
                }else if(letter == 'B'){
                    result = "Great Job";
                }else if (letter == 'C'){
                    result = "|Good";
                }else if(letter == 'D'){
                    result = "Passed";
                }else if(letter == 'F'){
                    result = "Failed";
                }
        System.out.println(result);
    }
}
