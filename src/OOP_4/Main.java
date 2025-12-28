package OOP_4;

import static OOP_4.Other.Operations.ADD;

public class Main {
    public static void main(String[] args) {

        Sauce sauce1 = new Sauce("шрирача", Hot.HOT);
        System.out.println(sauce1);

        System.out.println(ADD.result(2, 5));
    }
}
