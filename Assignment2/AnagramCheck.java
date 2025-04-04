package Assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        //check length
        if (str1.length() != str2.length()) {
            System.out.println("Are the strings Anagrams ? False");
            return;
        }



        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        //sort arrays
        for (int i = 0; i < str1Array.length - 1; i++) {
            for (int j = 0; j < str1Array.length -1 -i; j++) {

                if(str1Array[j] > str1Array[j + 1]){
                    char tempStore = str1Array[j];
                    str1Array[j] = str1Array[j +1];
                    str1Array[j+1] = tempStore;
                }
            }
        }
        for (int i = 0; i < str2Array.length - 1; i++) {
            for (int j = 0; j < str2Array.length -1 -i; j++) {

                if(str2Array[j] > str2Array[j + 1]){
                    char tempStore = str2Array[j];
                    str2Array[j] = str2Array[j +1];
                    str2Array[j+1] = tempStore;
                }
            }
        }

        //check if anagram
        boolean isAnagram = Arrays.equals(str1Array, str2Array);
        System.out.println("Are the strings Anagram = " + isAnagram);
    }
}
