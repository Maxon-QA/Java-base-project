public class Methods {
    public static void main(String[] args) {
        /*double result = fraction(5.3);
        System.out.format("%.3f", result);*/
        //System.out.println(sumLastNums(12371));
        //System.out.println(charToNum('5'));
        //System.out.println(isPositive(5));
        //System.out.println(is2Digits(51));
        //System.out.println(isUpperCase('A'));
        System.out.println(isInRange(1, 2, 3));
        //System.out.println(isDivisor(2, 15));
        //System.out.println(isEqual(1, 2, 3));

        /*int result = lastNumSum(5, 11);
        result = lastNumSum(result, 123);
        result = lastNumSum(result, 14);
        result = lastNumSum(result, 1);
        System.out.println(result);
        */
    }

    //1
    public static double fraction(double x) {
        return x - (int) x;
    }

    //2
    public static int sumLastNums(int x) {
        return (x % 10 + (x % 100 / 10));
    }

    //3
    public static int charToNum(char x) {
        return (int) x - 48;
    }

    //4
    public static boolean isPositive(int x) {
        return x > 0;
    }

    //5
    public static boolean is2Digits(int x) {
        String str = Integer.toString(x);
        return str.length() == 2;
    }

    //6
    public static boolean isUpperCase(char x) {
        return (x >= 'A') && (x <= 'Z');
    }

    //7
    public static boolean isInRange(int a, int b, int num) {
        return ((a <= num) && (num <= b)) || ((a >= num) && (num >= b));
    }

    //8
    public static boolean isDivisor(int a, int b) {
        return (a % b == 0) || (b % a == 0);
    }

    //9
    public static boolean isEqual(int a, int b, int c) {
        return (a == b) && (a == c);
    }

    //10
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }
}


