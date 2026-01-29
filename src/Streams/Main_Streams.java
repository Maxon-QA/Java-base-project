package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_Streams {
    public static void main(String[] args) {

        //Задача #1. Преобразование потока строк в строку
//        String[] stringArray = {"Это первая строка", "Вот это уже вторая строка", "Ну а это третья строка"};
//        Stream<String> arrayStream = Arrays.stream(stringArray);
//        System.out.println(getStringFromStream(arrayStream));

        //Задача #2. Замена for на forEach (РЕШЕНИЕ)
        ArrayList<Integer> listInteger = new ArrayList<>(Arrays.asList(3, 6, 8, 12, 58, 8, 45, 7));
        printList(listInteger);
        System.out.println();
        printList1(listInteger);
        System.out.println();
        printList2(listInteger);
    }

    //Задача #1. Преобразование потока строк в строку
    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }

    //Задача #2. Замена for на forEach (ИСХОДНИК)
    public static void printList1(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //Задача #2. Замена for на forEach (РЕШЕНИЕ)
    public static void printList(ArrayList<Integer> list) {
        list.forEach(i -> System.out.println(i));
    }

    //Задача #2. Замена for на forEach (РЕШЕНИЕ, но другое)
    public static void printList2(ArrayList<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }
    }
}
