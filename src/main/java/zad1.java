public class zad1 {
// Write a program to swap two String without a temporary variable.

    public static void main(String[] args) {

        String a= "Donald";
        String b="Duck";

        a=a+b;
        b=a.substring(0,(a).length()-b.length());
        a=a.substring(b.length());

        System.out.println(a);
        System.out.println(b);
    }

}
