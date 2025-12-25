package ru.courses.base;

public class Cycle {
    public static void main(String[] args) {
        //System.out.println(listNums(1));
        //System.out.println(reverseListNums(15));
        //System.out.println(chet(9));
        //System.out.println(pow(2, 6));
        //System.out.println(numLen(491));
        //System.out.println(equalNum(-555));
        //square(5);
        //leftTriangle(2);
        rightTriangle(5);
        //guessGame();


    }

    //1
    public static String listNums(int x) {
        String res = "";
        for (int i = 0; i <= x - 1; i++) {
            res += i + " ";
        }
        res += x;
        return res;
    }

    //2
    public static String reverseListNums(int x) {
        String res = "";
        for (int i = x; i >= 0; i--) {
            res += i + " ";
        }
        return res.trim();
    }

    //3
    public static String chet(int x) {
        String res = "";
        for (int i = 0; i <= x - 1; i += 2) {
            res += i + " ";
        }
        return res.trim();
    }

    //4
    public static int pow(int x, int y) {
        int res = 1;
        for (int i = 1; i <= y; i++) {
            res *= x;
        }
        return res;
    }

    //5 not right
    public static int numLen1(long x) {
        int res = 0;
        for (int i = 1; i <= x; i *= 10) {
            res++;
        }
        return res;
    }

    //5
    public static int numLen(long x) {
        int res = 0;
        do {
            res++;
            x /= 10;
        } while (x > 0);
        return res;
    }

    //6
    public static boolean equalNum(int x) {
        if (x < 0) {
            x *= -1;
        }

        int check = x % 10;
        x /= 10;

        while (x > 0) {
            if (check != x % 10) return false;
            x /= 10;
        }
        return true;
    }

    //7
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            if (i < x - 1) {
                System.out.println();
            }

        }
    }

    //8
    public static void leftTriangle1(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            if (i < x) {
                System.out.println();
            }
        }
    }
    //8 Ответ
    public static void leftTriangle(int x) {
        for (int i = 1; i < x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 1; j <= x; j++) {
            System.out.print("*");
        }
    }

    //9 not right. because user REPEAT
    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print(" ".repeat(x - i));
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            if (i < x) {
                System.out.println();
            }
        }
    }

    //9
    public static void rightTriangle1(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    //10
    public static void guessGame() {
        int randomNum = 3;
        int count = 0;

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("What number am I thinking (0 to 9)? :");

        while (true) {
            count++;
            int x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
                System.out.println("Count attempts = " + count);
                break;
            }
        }
    }


    public static void tableMulti() {
        System.out.println("\t-----------------------------------------------------------------------------------------------------------------------------");
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print("\t" + "|\t" + j + "*" + i + "=" + i * j + " ");
            }
            System.out.println("\t" + "| ");
            System.out.println("\t-----------------------------------------------------------------------------------------------------------------------------");
        }
    }
}



