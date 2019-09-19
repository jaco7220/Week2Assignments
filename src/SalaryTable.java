
public class SalaryTable {

    
    public static void main(String[] args) {
        double oldsal=40000, newsal=40000;
        System.out.format("%s","YEAR");
        System.out.format("%15s","OLD SALARY");
        System.out.format("%10s","RAISE");
        System.out.format("%15s","NEW SALARY\n");
        System.out.format("%s","----");
        System.out.format("%15s","----------");
        System.out.format("%10s","-----");
        System.out.format("%15s","----------\n");
        
        System.out.format("%2d",1);
            System.out.format("%14s","---");
            System.out.format("%16s","$40000.00");
            System.out.format("%11s\n","$40000.00");
            
        for (int i = 1; i < 10; i++) {
            oldsal=newsal;
            newsal*=1.03;
            System.out.format("%2d",i+1);
            System.out.format("%9s%.2f","$",oldsal);
            System.out.format("%5s%.2f","$",oldsal*0.03);
            System.out.format("%4s%.2f\n","$",newsal);
        }
    }
    
}
