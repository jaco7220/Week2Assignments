
import java.util.Scanner;


public class EmployeePay {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int employees = s.nextInt();
        double[] hours = new double[employees];
        double[] regpay = new double[employees];
        double[] overpay = new double[employees];
        double[] totalpay = new double[employees];
        double regtotal = 0, overtotal = 0, grandtotal = 0;
        for (int i = 0; i < hours.length; i++) {
            while(true){
                System.out.format("Enter hours worked for Employee %d: ",i+1);
                if(s.hasNextInt())
                    hours[i]=s.nextDouble();
                else{
                    System.out.println("Invalid, try again");
                    s.nextLine();
                    continue;
                }
                if(hours[i]>=1 && hours[i]<=70)
                    break;
                else
                    System.out.println("Invalid, try again");
            }
            if(hours[i]>=40){
                regpay[i]=15.0*40.0;
                overpay[i]=(hours[i]-40.0)*22.5;
            }
            else{
                regpay[i]=15.0*hours[i];
            }
            totalpay[i]=regpay[i]+overpay[i];
            System.out.format("Regular pay:  $%.2f\n",regpay[i]);
            System.out.format("Overtime pay: $%.2f\n",overpay[i]);
            System.out.format("Total pay:    $%.2f\n",totalpay[i]);
            System.out.println("----------------------------------");
        }
        for (int i = 0; i < hours.length; i++) {
            regtotal+=regpay[i];
            overtotal+=overpay[i];
            grandtotal+=totalpay[i];
        }
        System.out.format("Regular pay total: %.2f\n",regtotal);
        System.out.format("Overtime pay total: %.2f\n",overtotal);
        System.out.format("Grand total: %.2f\n",grandtotal);
    }
    
}
