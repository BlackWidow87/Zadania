public class zad7 {

    //Count the numbers of words in a String.

    public static void main(String[] args) {

        String wordsTotal = "Happy New Year 2024";

        String[]array=wordsTotal.split(" ");
        int singleWords = array.length;

        System.out.println("Total number of words in given String is : " + singleWords);
    }


}
