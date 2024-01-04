public class zad2 {
    //Find out how many alpha characters are present in a String.

    public static void main(String[] args) {

        String word = "NewYear2024!!!";

        word=word.replaceAll("[^A-Za-z0-9]", "");
        int number= word.length();

        System.out.println("Number of alfa character = " + number);


    }
}
