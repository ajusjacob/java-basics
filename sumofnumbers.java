import java.util.Scanner;

class Sumofnnumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("The entered number is:"+ num);
        int sum=0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("The result is :"+" "+sum);
    }
}