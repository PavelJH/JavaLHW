package lection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork_005 {
    public static void main(String[] args) {
        List<String> listRep = Arrays.asList("Hello", "Hello", "do", "putt", "do", "do", "putt");
        System.out.println(notRepString(listRep));
        List<Integer> listInt = Arrays.asList(1, 3, 5, 6, 7, 8, 12);
        System.out.println(listOddNumber(listInt));

    }

    public static List<Integer> listOddNumber(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        for (Integer i : list
        ) {
            if (i % 2 == 0) result.add(i);
        }
        return result;
    }

    public static List<String> notRepString(List<String> list) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!result.contains(list.get(i)))
            result.add(list.get(i));
//set Прочитать TODO
            }

        return result;
    }

}
