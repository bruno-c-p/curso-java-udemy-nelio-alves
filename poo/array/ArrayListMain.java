package poo.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListMain {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco");

        System.out.println(list.size());

        list.remove("Anna");
        list.remove(1);

        for (String x : list) {
            System.out.println(x);
        }

        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();

        for (String x : result) {
            System.out.println(x);
        }

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(name);
    }
}
