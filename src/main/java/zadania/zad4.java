import java.util.Scanner;

public class zad4 {

// check if String is Palindrome;

    void Palindrome(String word) {


        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();

        if (stringBuilder.toString().equals(word)) {
            System.out.println("The String is Palindrome");
        } else {
            System.out.println("The String is not Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word");
        String word = scan.nextLine();

        zad4 obj1 = new zad4();

        obj1.Palindrome(word);

    }

}


