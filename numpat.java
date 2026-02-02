public class numpat {

    public static void main(String[] args) {
        int i = 0;
        int num = 1;
        while (i <= 3) {

            int j = 0;
            while (j <= i) {
                System.out.print(num +" ");
                 num++;
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
  