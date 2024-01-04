public class zad3 {
    //Reverse String

    public static void main(String[] args) {

        //option A

        String a = "Good morning";

        StringBuffer z = new StringBuffer(a);

        System.out.println(z.reverse());

        //option B

        String needsToBeReverse = "Good morning";

        //using charAt();

        String reversed="";

        for (int i=needsToBeReverse.length()-1; i>=0; i--) {
            reversed = reversed + needsToBeReverse.charAt(i);
        }
        System.out.println("Reversed String is " + reversed);

        // using to charArray();

        String reversed2="";

        char[]array= needsToBeReverse.toCharArray();
        for(int i=array.length-1; i>=0; i--) {
            reversed2 = reversed2 + array[i];
        }
        System.out.println("Reversed String opt2 is  " + reversed2 );
        }

        }


