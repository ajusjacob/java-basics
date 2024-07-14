import java.util.Scanner;

public class average {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        System.out.println("Entered numbers are:"+" "+num1+ "\t "+num2);
        double avg=(num1+num2)/2;
        System.out.println("The result is:"+avg);
    }
}
