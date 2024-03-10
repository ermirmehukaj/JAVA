package day15_WhileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "xxxxxxxxxxzzzzzzzyyyyyyyyyxxxxxxxzzzzzzz";

        String result = "";   //"xzy"

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str

            char each = str.charAt(i);   // each character of the String str

            if( ! result.contains( ""+ each)  ){ // if the string result does not contain the character of string str yet
                result += each; // then we will add the character to string result
            }
            // if the character is not contained yet in the new string, then we will add it to the new string

        }


        System.out.println(result);


        System.out.println("----------------------------");

        for (int i = 50; i < 101; i++) {
            if(i % 2 ==0)

            System.out.println(i);
        }

    }

}

/*
3. Write a program that can remove the duplicated characters from a string

				Ex:
					str = "aabbbcccc"

					output:
						abc


 */
