
import java.util.Scanner;


public class Divide {

    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num1,num2;
        int small,big;
        System.out.print("Enter first number: ");
        num1=s.nextInt();
        System.out.print("Enter second number: ");
        num2=s.nextInt();
        big=Math.max(num1, num2);
        small=Math.min(num1, num2);
        System.out.format("%d / %d = %d r%d\n",big,small,big/small,big%small);
    }
    
}
