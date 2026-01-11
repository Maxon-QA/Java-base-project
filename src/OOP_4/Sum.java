package OOP_4;

public class Sum {
    public static void main(String[] args) {
        double sum = 0;

        String checkDouble = "^-?(?:\\d+\\.?\\d*|\\.\\d+)([eE][-+]?\\d+)?$";

        for (int i = 0; i < args.length; i++) {
            if (args[i].matches(checkDouble)) {
                sum += Double.parseDouble(args[i]);
            }
        }
        System.out.println(sum);
    }
}