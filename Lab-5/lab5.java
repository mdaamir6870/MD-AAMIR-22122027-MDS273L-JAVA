import java.util.Scanner;

public class lab5 {

    public static String encrypt(String message) {
        String text = "";
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = Character.toUpperCase(c) - 'A';
                text += "XYZABCDEFGHIJKLMNOPQRSTUVW".charAt(index);
            } else {
                text += c;
            }
        }
        return text;
    }

    public static String decrypt(String text) {
        String message = "";
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = "XYZABCDEFGHIJKLMNOPQRSTUVW".indexOf(c);
                message += (char) ('A' + index);
            } else {
                message += c;
            }
        }
        return message;
    }

    public static void main(String[] args) {
        Scanner bella = new Scanner(System.in);
        while (true) {
            System.out.print("Enter E to encrypt, D to decrypt, or Q to quit: ");
            String choice = bella.nextLine().toUpperCase();
            if (choice.equals("E")) {
                System.out.print("Enter plaintext message: ");
                String plaintext = bella.nextLine();
                System.out.println("Ciphertext: " + encrypt(plaintext));
            } else if (choice.equals("D")) {
                System.out.print("Enter ciphertext message: ");
                String ciphertext = bella.nextLine();
                System.out.println("Plaintext: " + decrypt(ciphertext));
            } else if (choice.equals("Q")) {
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }
}





