import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                sb.append(ch);
            }
        }

        System.out.println("String without spaces: " + sb.toString());
        sc.close();
    }
}
