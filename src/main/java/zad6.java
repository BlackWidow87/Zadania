public class zad6 {
    //  Create a method to count vowels in a String "documentation;

    public static int countVowels(String word) {

        word = word.toLowerCase();

        int vowelCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'
                    || word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        String word= "documentation";
        int numOfVowels = countVowels(word);

        System.out.println("The number of vowels in the string is: " + numOfVowels);
    }

}