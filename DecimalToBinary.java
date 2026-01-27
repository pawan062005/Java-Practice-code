import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Binary: 0");
        } else {
            String binary = "";
            int num = n;
            while (num > 0) {
                int rem = num % 2;
                binary = rem + binary; // add at front
                num = num / 2;
            }
            System.out.println("Binary of " + n + " = " + binary);
        }

        sc.close();
    }
}
