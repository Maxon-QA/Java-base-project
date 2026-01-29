package Collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) throws IllegalAccessException {
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        Dog dog = new Dog("good boy", 3, new ArrayList<>(Arrays.asList("Mr", "Ledi")), "Макс");
        setNulls(cat);
        System.out.println("------------");
        setNulls(dog);

    }

    private static void setNulls(Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.get(obj));
        }

        for (Field field : fields) {
            field.setAccessible(true);
            if (!field.getType().isPrimitive()) {
                field.set(obj, null);
            }
        }
        System.out.println();

        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.get(obj));
        }
    }
}


