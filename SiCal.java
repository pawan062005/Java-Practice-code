import java.util.Scanner;
public class SiCal {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in );
        System.out.println("Enter Principal amount:");
        double p= sc.nextDouble();
        System.out.println("enter rate of interest:");
        double r =sc.nextDouble();
        System.out.println("enter time in years:");
        double t = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("simple intrest is:" +si);

    }
    
}
