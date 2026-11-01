import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        do {
            total += SafeInput.getRangedDouble(in, "Item price", 0.50, 10.00);
        } while (SafeInput.getYNConfirm(in, "Do you have another item?"));
        System.out.printf("Total: $%.2f%n", total);
    }
}
