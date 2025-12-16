package OOP_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private final String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, Integer... grades) {
        this.name = name;
        if (grades != null) {
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] < 2 || grades[i] > 5) {
                    throw new IllegalArgumentException("Оценка должна быть в пределах [2,5]");
                }
            }
            Collections.addAll(this.grades, grades);
        }
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    @Override
    public String toString() {
        return name + " : " + grades;
    }

}
