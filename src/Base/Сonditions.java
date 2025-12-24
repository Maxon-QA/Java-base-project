package Base;

public class Сonditions {
    public static void main(String[] args) {
        //System.out.println(abs(-5));
        //System.out.println(safeDiv(4, 0));
        //System.out.println(max(7, 1));
        //System.out.println(makeDecision(8, 8));
        //System.out.println(max3(8, 7, 1));
        //System.out.println(sum3(111, 7, 4));
        //System.out.println(sum2(4, 29));
        //System.out.println(is35(15));
        //System.out.println(magic6(1, 6));
        //System.out.println(age(22));
        //System.out.println(day(9));
        printDays("суббота");
    }

    //1
    public static int abs(int x) {
        return x > 0 ? x : -x;
    }

    //2
    public static int safeDiv(int x, int y) {
        if (y == 0) return 0;
        return x / y;
    }

    //3
    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    //4
    public static String makeDecision(int x, int y) {
        String ans = null;
        if (x > y) {
            ans = x + " > " + y;
        }

        if (x < y) {
            ans = x + " < " + y;
        }

        if (x == y) {
            ans = x + " = " + y;
        }

        return ans;
    }

    //5
    public static int max3(int x, int y, int z) {
        if (x >= y && x >= z) return x;
        if (y >= x && y >= z) return y;
        else return z;
    }

    //6
    public static boolean sum3(int x, int y, int z) {
        if (x + y == z) return true;
        if (x + z == y) return true;
        if (z + y == x) return true;

        else return false;
    }

    //7
    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) return 20;
        else return sum;
    }

    //8
    public static boolean is35(int x) {
        boolean mod3 = x % 3 == 0;
        boolean mod5 = x % 5 == 0;

        if (mod3 && mod5) return false;
        if (mod3) return true;
        if (mod5) return true;
        else return false;
    }

    //9
    public static boolean magic6(int x, int y) {
        boolean sum = x + y == 6;
        boolean sub = x - y == 6 || y - x == 6;
        boolean is6 = x == 6 || y == 6;

        if (sum || sub || is6) return true;
        else return false;
    }

    //10

    public static String age2(int x) {
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;
        if (lastDigit == 1 && lastTwoDigits != 11) {
            return x + " год";
        }
        if (lastDigit >= 2 && lastDigit <= 4 && !(lastTwoDigits >= 12 && lastTwoDigits <= 14)) {
            return x + " года";
        }
        return x + " лет";
    }

    public static String age(int x) {
        if (x % 10 == 1) {
            if (x % 100 != 11) {
                return (x + " год");
            }
        }
        if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4) {
            if ((x % 100 != 12) && (x % 100 != 13) && (x % 100 != 14)) {
                return (x + " года");
            }
        }
        return (x + " лет");
    }

    //11
    public static String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    //12
    public static void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }
}


