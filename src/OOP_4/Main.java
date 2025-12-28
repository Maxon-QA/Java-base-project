package OOP_4;

public class Main {
    public static void main(String[] args) {

        System.out.println(Operations.MULT.result(2, 5));
    }

    enum Operations {
        ADD {
            public int result(int x, int y) {
                return x + y;
            }
        }, SUB {
            public int result(int x, int y) {
                return x - y;
            }
        }, DIV {
            public int result(int x, int y) {
                return x / y;
            }
        }, MULT {
            public int result(int x, int y) {
                return x * y;
            }
        };

        public abstract int result(int x, int y);
    }
}
