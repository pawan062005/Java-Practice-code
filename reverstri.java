public class reverstri {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 3) {

            int j = 0;
            while (j <= 4 - i) {
                System.out.print(" ");
                j++;
            }
            j=0;
            while (j < 2*i+1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
    }
        
    }
}
