package day22_arrayList;

import java.security.spec.RSAOtherPrimeInfo;

public class WrapperClassMethods {
    public static void main(String[] args) {



        String str = "20";

        System.out.println(str + 1);


         int num = Integer.parseInt(str);

        System.out.println(num + 2);

        Integer num2 = Integer.valueOf(str);

        System.out.println(num2);

        System.out.println("-----------------------------------");


        String s1 = "20.5";

       double num3 = Double.parseDouble(s1);
       Double num4 = Double.valueOf(s1);

        System.out.println(num3);
        System.out.println(num4);

        String x = "true";

        boolean n1 = Boolean.parseBoolean(x);
        Boolean r2 = Boolean.valueOf(x);

        System.out.println(n1);
        System.out.println(r2);

        System.out.println("----------------------------------------------");

        char ch = '$';

        boolean q1 = Character.isDigit(ch);

        boolean isLetter = Character.isLetter(ch);

        boolean isLower = Character.isLowerCase(ch);
        boolean isSpecialChar = !Character.isLetterOrDigit(ch);

        System.out.println(q1);
        System.out.println(isLetter);
        System.out.println(isLower);
        System.out.println(isSpecialChar);

        System.out.println("----------------------------------------------");


        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) {

            if(Character.isDigit(each)){
                sum +=Integer.parseInt(each + "");
            }

        }

        System.out.println(sum);




        System.out.println("-----------------------------------------");

            String str4 = "JAVA java";
boolean b1 = false;
int isUpercaseCount = 0;
int isLowerCaseCount = 0;

        for (char c : str4.toCharArray()) {
            if(Character.isUpperCase(c)){
                   isUpercaseCount++;
            } else if (Character.isLowerCase(c)) {
                isLowerCaseCount++;
                boolean UpperLower = isLowerCaseCount == isUpercaseCount;
            }
        }
String str3 = "Wooden Spoon!",
        isLeter = "",
        isDigit = "",
        specialchar = "";

        for (char c : str3.toCharArray()) {
            if(Character.isLetter(c)){
                isLeter += c;
            }
            if(Character.isDigit(c)){
                isDigit+=c;
            }
        if(!Character.isLetterOrDigit(c)){
             specialchar +=c;
        }
        }

        System.out.println(isLeter);
        System.out.println(isDigit);
        System.out.println(specialchar);
        System.out.println("--------------------------------------");


        String str5 = "JAVA ava";
        int  lowerCase = 0,
                upperCase = 0;
        boolean isEqual = true;

        for (char each : str5.toCharArray()) {
            if(Character.isUpperCase(each)){
                upperCase++;
            }
            if(Character.isLowerCase(each)){
                lowerCase++;
            }
            if(upperCase == lowerCase){
                isEqual = true;
            }



        }

        System.out.println(isEqual);

    }
    }



