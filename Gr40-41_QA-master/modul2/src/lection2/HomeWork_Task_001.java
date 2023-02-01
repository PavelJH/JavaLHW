package lection2;

import java.util.ArrayList;
import java.util.List;
//У вас есть список строковых значений, и вы должны вернуть список со всеми этими строковыми значениями в нижнем регистре (или в верхнем регистре)
public class HomeWork_Task_001 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //list.add("Hello");
        //list.add("Buy");
        for (int i = 0; i < 10; i++) {
            list.add("Hello" + i);
        }
        List<String> listFinalUpper = listUpper(list);
        System.out.println(listFinalUpper);
        List<String> listFinalLower = listUpper(list);
        listLower(listFinalLower);
        System.out.println(listFinalLower);
    }
    public static List<String> listUpper(List<String> listList) {
        List<String> method1 = new ArrayList<>();
        for (int i = 0; i < listList.size(); i++) {
            method1.add(listList.get(i).toUpperCase());
            /*listList.get(i);
            String get = listList.get(i);
            String newget = get.toUpperCase();
            method1.add(newget);*/
        }
        return method1;
    }
    public static void listLower(List<String> lislListLower){
        for (int i = 0; i < lislListLower.size(); i++) {
            lislListLower.set(i, lislListLower.get(i).toLowerCase());
        }
    }
}
