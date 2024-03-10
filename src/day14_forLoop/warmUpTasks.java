package day14_forLoop;

public class warmUpTasks {

    public static void main(String[] args) {
      String str3 =  combine("java", "apple");
        System.out.println(str3);
        System.out.println("---------------------------------");
        System.out.println(sumOf2IntigerNumbers(10,20));
        System.out.println(sumOf3IntigerNumbers(30,3,4));
        System.out.println(sumOf4IntgerNumbers(12,32,21,1));

    }

    public static String combine(String str1, String str2) {
    String result;
   /* if(str1.endsWith("" + str2.charAt(0))) {// if the first string ends with the first character of the second string

    result = str1 + str2.substring(1);
    }else {
    result = str1 + str2;
    }
*/

        if(str1.charAt(str1.length()-1)== str2.charAt(0)){
                result = str1 + str2.substring(1);
        }else {
            result = str1 + str2;
        }

    return result;


    }


    public static int sumOf2IntigerNumbers(int n1,int n2){
        return n1 + n2;
    }

    public static int sumOf3IntigerNumbers(int n1,int n2, int n3){
        //return n1 + n2 + n3;
        return sumOf2IntigerNumbers( n1 , n2) + n3;
    }
    public static int sumOf4IntgerNumbers(int n1,int n2, int n3,int n4){
        //return n1 + n2 + n3 + n4;
        return sumOf3IntigerNumbers(n1, n2, n3)+ n4;
    }


    }






