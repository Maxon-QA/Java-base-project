package OOP_4;

public class Other {

    static int op(int x, int y, int op) {
        switch (op) {
            case 1:
                return x + y;
            case 2:
                return x - y;
            case 3:
                return x * y;
            case 4:
                return x / y;
        }
        return 0;
    }

    enum Operations22 {
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


