import java.util.Arrays;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String chara=sc.nextLine();
        System.out.println("The word is"+ " " +chara);
        char[] myArray=chara.toCharArray();
        int size=myArray.length;
        char[] original=Arrays.copyOf(myArray, size);
        for(int i=0;i<size/2;i++){
            char temp=myArray[i];
            myArray[i]=myArray[size-i-1];
            myArray[size-i-1]=temp;
        }
        System.out.println("The original array:"+Arrays.toString(original));
        System.out.println("The reversed array:"+Arrays.toString(myArray));

        if (Arrays.equals(original,myArray)) {
            System.out.println("The string is a palindrome.");
        }else{
            System.out.println("The string is not a palindrome.");
        }
    }
}
