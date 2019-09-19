
import java.util.Scanner;

public class PowersChart {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int expo;
        while (true) {
            System.out.print("Enter an exponent value: ");
            if (s.hasNextInt()) {
                expo = s.nextInt();
            } else {
                System.out.println("Invalid, try again");
                s.nextLine();
                continue;
            }
            System.out.println("past contrine");
            if (expo >= 0 && expo <= 10) {
                break;
            } else {
                System.out.println("Invalid, try again");
            }
        }

        System.out.format("X");
        System.out.format("\t  2^X\n");
        System.out.println("-------------");
        for (int i = 0; i <= expo; i++) {
            System.out.format("%d", i);
            System.out.format("\t2^%d=%d\n",i,(int)Math.pow(2, i));
        }

    }

}
