public class MultipleExceptionsDemo {
    public static void main(String[] args) {
        try {
            String s = "123a";
            int num = Integer.parseInt(s); 

            int[] arr = new int[3];
            arr[5] = 10; 
            int a = 10 / 0; 
        } 
        catch (NumberFormatException e) {
            System.out.println("Number format error: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Some other exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
