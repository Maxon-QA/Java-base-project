package OOP_3;

import java.util.Arrays;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Other {

    public static double sumAll(Number... differentNumbers) {
        double answer = 0;
        for (int i = 0; i < differentNumbers.length; i++) {
            answer += differentNumbers[i].doubleValue();
        }
        return answer;
    }

    public static double myPow(String str1, String str2) {
        double num1 = parseInt(str1);
        double num2 = parseInt(str2);
        return pow(num1,num2);
    }
}
