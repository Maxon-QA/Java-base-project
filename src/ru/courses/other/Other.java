package ru.courses.other;

public class Other {

    public static double sumAll(Number... differentNumbers) {
        double answer = 0;
        for (int i = 0; i < differentNumbers.length; i++) {
            answer += differentNumbers[i].doubleValue();
        }
        return answer;
    }
}
