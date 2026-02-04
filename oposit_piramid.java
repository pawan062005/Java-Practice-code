public class oposit_piramid {
    public static void main(String[] args) {
        int i = 0;
       
        while (i < 5) {

            int j = 0;
            while (j < i-1 ) {
                System.out.print(" ");
               
                j++;
            }
            j=0;
            while (j < i-1 ) {
                System.out.print("*");
               
                j++;
                
            }

            System.out.println();
            i++;
        }
    }
}
