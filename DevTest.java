import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Name: " + SafeInput.getNonZeroLenString(in, "Enter your name"));
        System.out.println("Integer: " + SafeInput.getInt(in, "Enter any integer"));
        System.out.println("Double: " + SafeInput.getDouble(in, "Enter any double"));
        System.out.println("Ranged integer: " + SafeInput.getRangedInt(in, "Enter 1-10", 1, 10));
        System.out.printf("Ranged double: %.2f%n", SafeInput.getRangedDouble(in, "Enter 0.50-10.00", 0.50, 10.00));
        System.out.println("Confirmed: " + SafeInput.getYNConfirm(in, "Continue"));
        System.out.println("UC M number: " + SafeInput.getRegExString(in, "Enter UC M number", "^(M|m)\\d{5}$"));
        SafeInput.prettyHeader("SafeInput test complete");
    }
}
