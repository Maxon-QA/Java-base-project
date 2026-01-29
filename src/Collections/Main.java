package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //pairwisePermutations();
//        ArrayList<Integer> myListBubble = new ArrayList<>(Arrays.asList(5, 4, 8, 9, 3));
//        bubbleSort(myListBubble);
//        System.out.println(myListBubble);
//        System.out.println("--------------------");
//        int[] intArrays = {5, 4, 8, 9, 3};
//        bubbleSort(intArrays);
//        System.out.println(Arrays.toString(intArrays));


//        ArrayList<Integer> listReverse1 = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5));
//        ArrayList<Integer> listReverse2 = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4));
//        reverse(listReverse1);
//        reverse(listReverse2);
//        System.out.println(listReverse1);
//        System.out.println(listReverse2);

//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,4,67,9,11,5));
//        System.out.println(list.stream().sorted().toList());
//        list = list.stream().sorted().toList();





    }

    //Задача #1. Попарные перестановки
    public static void pairwisePermutations() {
        int N = 6;
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            myList.add(i);
        }
        System.out.println(myList);

        for (int i = 0; i < myList.size(); i += 2) {
            int temp = myList.get(i);
            myList.set(i, myList.get(i + 1));
            myList.set(i + 1, temp);
        }
        System.out.println(myList);
    }

    //Задача #2. Замена ArrayList на массив (ИСХОДНИК)
    public static void bubbleSort(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
    }

    //Задача #2. Замена ArrayList на массив (РЕШЕНИЕ)
    public static void bubbleSort(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - 1 - i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }

    //Задача #3. Замена массива на ArrayList (ИСХОДНИК)
    public static void reverse(int[] intArray) {
        int n = intArray.length - 1;
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = temp;
        }
    }

    //Задача #3. Замена массива на ArrayList (РЕШЕНИЕ)
    public static void reverse(ArrayList<Integer> intList) {
        int n = intList.size() - 1;
        for (int i = 0; i < intList.size() / 2; i++) {
            int temp = intList.get(i);
            intList.set(i, intList.get(n - i));
            intList.set(n - i, temp);
        }
    }
}