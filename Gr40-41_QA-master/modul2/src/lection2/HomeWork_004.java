package lection2;

import jdk.internal.jimage.ImageStrings;

import java.util.ArrayList;
import java.util.List;

    // У вас есть список значений String, и вы должны вернуть список длины каждого из этих значений String.
    public class HomeWork_004 {
        public static void main(String[] args) {
            List<String> listQuantity = new ArrayList<>();
            listQuantity.add("HelloHello");
            listQuantity.add("Lol");
            listQuantity.add("lay");
            System.out.println(listQual(listQuantity, 3));
        }

        public static List<String> listQual(List<String> listList, int number) {
            List<String> result = new ArrayList<>();

            for (String s : listList
            ) {if (s.length() == number)
                result.add(s);
            }
            return result;
        }
    }







