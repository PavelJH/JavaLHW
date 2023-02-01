package lection2;

import java.util.ArrayList;
import java.util.List;

// У вас есть список значений String, и вы должны вернуть список длины каждого из этих значений String.
public class HomeWork_Task_003 {
    public static void main(String[] args) {
        List<String> listQuantity = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            listQuantity.add("HelloHello" );
//            System.out.println(listQuantity);// добить других слов
        }
        List<String> listFinalUpperQuantity = listQual(listQuantity);
        System.out.println(listFinalUpperQuantity);
    }
    public static List<String> listQual(List<String> listList){
        List<String> quantity = new ArrayList<>();
        for (int i = 0; i < listList.size(); i++) {
            quantity.add(String.valueOf(listList.get(i).length()));

        }
        return quantity;
    }

    // Не понимаю почему не работает
}
