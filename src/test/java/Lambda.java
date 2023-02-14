import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        int[] zahlen = {8,2,1,9,1};


        OptionalInt a= Arrays.stream(zahlen).max();
        System.out.println(a.getAsInt());

        Arrays.stream(zahlen).distinct().forEach(System.out::println);      //elemanlari tekrarsiz olarak getirir.

        Arrays.stream(zahlen).map(t->t*t).forEach(System.out::println);

        var kim="fasafiso";
        var sin=5;

        //--------------------map-----------------------

        List<String> strings = Arrays.asList("Java", "Lambda", "Functional", "Programming");

        List<String> upperCaseStrings = strings.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        upperCaseStrings.stream().forEach(System.out::println);

        // bir array listi büyük harfe cevirme

        //----------------------filter-----------------------

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        oddNumbers.stream().forEach(System.out::println);

        //tek sayilari filtreler.

        //---------------------reduce------------------------

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int sum = numbers2.stream()
                .reduce(0, (x, y) -> x + y);

        System.out.println("toplam: "+sum);

        //tüm sayilarin toplamini hesaplar


        //-------------------sorted--------------------------

        List<Integer> numbers3 = Arrays.asList(9, 2, 6, 1, 7, 3, 8, 5, 4);

        List<Integer> sortedNumbers = numbers3.stream()
                .sorted((c, d) -> d.compareTo(c))
                .collect(Collectors.toList());

        sortedNumbers.stream().forEach(System.out::println);

        //büyükten kücüge dogru siralar.

        //--------------------flatMap------------------------

        List<List<String>> words = Arrays.asList(Arrays.asList("Java", "Python","C++", "JavaScript"));

        List<Integer> wordLengths = words.stream()
                .flatMap(List::stream)
                .map(String::length)
                .collect(Collectors.toList());

        wordLengths.stream().forEach(System.out::println);

        //her bir elemanin uzunlugundan olusan bir list olusturur.

    }
}
