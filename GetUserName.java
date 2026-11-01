import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = SafeInput.getNonZeroLenString(in, "Enter your first name");
        String last = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + first + " " + last);
    }
}
