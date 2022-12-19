import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scan.nextLine();
        System.out.println("The reverse of \"" + string + "\" is:\n" + reverse(string));
    }

    public static String reverse(String string) {
        String reverseString = "";
        for(int i = string.length(); i > 0; i--) {
            reverseString += string.charAt(i - 1);
        }

        return reverseString;
    }
}