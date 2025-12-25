package ru.courses.geometry;

import java.util.Arrays;

public interface Measurable {
    public abstract double getLength();

    public static void print(Measurable... differentLines) {
        System.out.println(Arrays.toString(differentLines));
    }
}
