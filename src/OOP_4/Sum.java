package OOP_4;

public class Sum {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                sum += Double.parseDouble(args[i]);
            } catch (NumberFormatException ex) {
                args[i] = "0";
            }
        }

        System.out.println(sum);
    }
}
