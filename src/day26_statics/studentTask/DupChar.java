package day26_statics.studentTask;

public class DupChar {
    public static void main(String[] args) {

        String str = "aabBcde";
        str = str.toLowerCase();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch ==  str.charAt(j)){
                    frequency++;



                }
            }
            if(frequency>1 && !result.contains(ch +"")){
                result = result + ch;
            }


        }

        System.out.println(result.length());

            }}



