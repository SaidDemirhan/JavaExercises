import java.util.Arrays;
import java.util.OptionalInt;

public class Lambda {
    public static void main(String[] args) {
        int[] zahlen = {8,2,1,9,1};


        OptionalInt a= Arrays.stream(zahlen).max();
        System.out.println(a.getAsInt());

        Arrays.stream(zahlen).distinct().forEach(System.out::println);      //elemanlari tekrarsiz olarak getirir.

        Arrays.stream(zahlen).map(t->t*t).forEach(System.out::println);

        var kim="fasafiso";
        var sin=5;

    }
}
