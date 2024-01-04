import java.util.*;
public class zad10 {

    /* Remove all duplicates from Array; */

    public static void removeDuplicates(int [] a) {

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        for (int i = 0; i < a.length; i++)
            set.add(a[i]);

        System.out.println(set);

    }

    public static void main(String[] args) {
        int a[]={8,5,2,3,4,5,6,6,4,5,8};

        removeDuplicates(a);

    }


}
