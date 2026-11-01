import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String value;
        do { System.out.print("\n" + prompt + ": "); value = pipe.nextLine(); }
        while (value.length() == 0);
        return value;
    }
    public static int getInt(Scanner pipe, String prompt) {
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) { int value = pipe.nextInt(); pipe.nextLine(); return value; }
            System.out.println("Please enter a whole number."); pipe.nextLine();
        }
    }
    public static double getDouble(Scanner pipe, String prompt) {
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) { double value = pipe.nextDouble(); pipe.nextLine(); return value; }
            System.out.println("Please enter a number."); pipe.nextLine();
        }
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        while (true) {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                int value = pipe.nextInt(); pipe.nextLine();
                if (value >= low && value <= high) return value;
                System.out.println("Please enter a value in the specified range.");
            } else { System.out.println("Please enter a whole number."); pipe.nextLine(); }
        }
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        while (true) {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                double value = pipe.nextDouble(); pipe.nextLine();
                if (value >= low && value <= high) return value;
                System.out.println("Please enter a value in the specified range.");
            } else { System.out.println("Please enter a number."); pipe.nextLine(); }
        }
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        while (true) {
            System.out.print(prompt + " [Y/N]: "); String value = pipe.nextLine().trim();
            if (value.equalsIgnoreCase("Y")) return true;
            if (value.equalsIgnoreCase("N")) return false;
            System.out.println("Please enter Y or N.");
        }
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        while (true) {
            System.out.print(prompt + ": "); String value = pipe.nextLine();
            if (value.matches(regEx)) return value;
            System.out.println("Input does not match the required format.");
        }
    }
    public static void prettyHeader(String msg) {
        final int width = 60, sides = 3, inner = width - sides * 2;
        if (msg.length() > inner) msg = msg.substring(0, inner);
        int padding = inner - msg.length(), left = padding / 2, right = padding - left;
        for (int i = 0; i < width; i++) System.out.print("*");
        System.out.println();
        for (int i = 0; i < sides; i++) System.out.print("*");
        for (int i = 0; i < left; i++) System.out.print(" ");
        System.out.print(msg);
        for (int i = 0; i < right; i++) System.out.print(" ");
        for (int i = 0; i < sides; i++) System.out.print("*");
        System.out.println();
        for (int i = 0; i < width; i++) System.out.print("*");
        System.out.println();
    }
}
