
import java.util.Scanner;
public class SimpleInterestcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount : ");
        double P = sc.nextDouble();
        System.out.println("Enter the Annual Interest Rate : ");
        double R = sc.nextDouble();
        System.out.println("Enter the Time Period : ");
        double T = sc.nextDouble();

        double SI = P * R * T /100 ;
        System.out.println("simple Interest : $" + SI);

        sc.close();
    }   
}