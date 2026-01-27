import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch == ' ') continue; // ignore spaces
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate characters are:");
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " -> " + e.getValue() + " times");
            }
        }

        sc.close();
    }
}

