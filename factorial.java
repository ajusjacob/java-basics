import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=1;
        for(int i=1;i<=num;i++){
            temp=temp*i;
        }
        System.out.println("The result is:"+temp);
        
    }
}
