package day16_nestedLoop;

public class frequencyOfChar {
    public static void main(String[] args) {
        String str = "aaabbbbccccc";
        char abc = 'a';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == abc){
                count++;
            }

        }

        System.out.println(count);

    }
}
