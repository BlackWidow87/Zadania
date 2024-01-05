import java.util.Scanner;

 class zad9 {
  // Find the first non-repeating character in a String. Given a string, find and return the first non-repeating character.

  public static char firstNonRepeatingChar(String letter) {

   int[] charCount = new int[256];

   for (int i = 0; i < letter.length(); i++) {
    charCount[letter.charAt(i)]++;

   }
   for (int i = 0; i < letter.length(); i++) {
    if (charCount[letter.charAt(i)] == 1) {
     return letter.charAt(i);
    }
   }
   return '$';
  }

  public static void main(String[] args) {
   Scanner word = new Scanner(System.in);

   System.out.println("Enter word");
   String str1 = word.nextLine();

   char result = firstNonRepeatingChar(str1);

   if (result != '$') {
    System.out.println("The first non-repeating character is: " + result);
   } else {
    System.out.println("No non-repeating character found in the string.");
   }
  }
 }





