import java.util.Scanner;

public class sum {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number range(0-1000):");
        int n = sc.nextInt();  

        int sum = 0;
        
        int temp=n;
        if (n < 0 || n > 1000) {
            System.out.println("Out of Range.");
        }
        else{
        while (temp > 0) {
            int digit = temp % 10;
            sum =sum + digit;
            temp =temp/10;
        }
    }
        System.out.println("Sum of  " + n + "digits is: " + sum);
    }
}
