package Collections;

import java.util.ArrayList;
import java.util.List;

public class Dog {
    private static String breed = "Persian"; // порода
    public String name;
    private int age;
    private List<String> friendsName = new ArrayList<>();
    private String owner;

    public Dog(String name, int age, List<String> friendsName, String owner) {
        this.name = name;
        this.age = age;
        this.friendsName = friendsName;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendsName=" + friendsName +
                '}';
    }
}

