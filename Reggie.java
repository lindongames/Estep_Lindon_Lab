import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = SafeInput.getRegExString(in, "Enter UC student M number", "^(M|m)\\d{5}$");
        String choice = SafeInput.getRegExString(in, "Menu choice Open/Save/View/Quit", "^[OoSsVvQq]$");
        System.out.println("SSN accepted: " + ssn);
        System.out.println("M number accepted: " + mNumber);
        System.out.println("Choice accepted: " + choice);
    }
}
