package lection2;
// У вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2

import java.util.ArrayList;
import java.util.List;

public class HomeWork_Task_002 {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listInt.add(i);
        }
        List<Integer> listMultiply = listMultiply(listInt);
        System.out.println(listMultiply);
        
    }
    public static List<Integer> listMultiply(List<Integer> listList){
        List<Integer> multiply = new ArrayList<>();
        for (int i = 0; i < listList.size(); i++) {
            multiply.add(listList.get(i)*2);

        }
        return multiply;
    }

}
