import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        System.out.print("Enter shift number: ");
        int number = scanner.nextInt();

        String encrypted = "";
        for (int i = 0; i < word.length(); i++) {
          char c = word.charAt(i);
          if (Character.isLetter(c)) {
          char shifted = (char) (c + number);
           encrypted += shifted;
          } else {
        encrypted += c;
    }
}
      System.out.println("Encrypted: " + encrypted);

      String decrypted = "";
for (int i = 0; i < encrypted.length(); i++) {
    char c = encrypted.charAt(i);
    if (Character.isLetter(c)) {
        char shifted = (char) (c - number);
        decrypted += shifted;
    } else {
        decrypted += c;
    }
}
System.out.println("Decrypted: " + decrypted);
    }
}
