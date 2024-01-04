import java.util.ArrayList;
import java.util.List;

public class zad8 {

// from list of Strings keep only ones that start with "A" and return them in lower case.

    public static List<String> wordsWithA(List<String> strings){
        List<String> chosenStrings = new ArrayList<>();

        for(String fancy: strings){
            if(fancy.toLowerCase().startsWith("a")){
                chosenStrings.add(fancy.toLowerCase());
            }
        }
    return chosenStrings;

    }

    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("Gucci");
        listOfStrings.add("Armani");
        listOfStrings.add("Prada");
        listOfStrings.add("Alexander McQueen");
        listOfStrings.add("Dolce & Gabbana");
        listOfStrings.add("Aquazurra");

        List<String> result = wordsWithA(listOfStrings);

        for(String pickedOne : result){
            System.out.println(pickedOne);
        }
    }
}
