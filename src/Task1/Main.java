package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        int[] intlist = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> newList = new ArrayList<>();

        System.out.println("Положительные,четные числа в массиве, отсортированные по возрастанию: ");

        for (int i = 0; i < intlist.length; i++) {
            if (intlist[i] > 0 && intlist[i] % 2 == 0) {
                newList.add(intlist[i]); //создаем новый лист , куда сохраняем отфильтрованный массив
            }
            //сортируем
            for (int j = intlist.length - 1; j > 0; j--) {
                for (int с = 0; с < j; с++) {
                /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами
                 */
                    if (intlist[с] > intlist[с + 1]) {
                        int tmp = intlist[с];
                        intlist[с] = intlist[с + 1];
                        intlist[с + 1] = tmp;
                    }
                }
            }
        }
        System.out.println(newList);
    }
}

