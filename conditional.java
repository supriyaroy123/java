import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a:");
        int a = sc.nextInt();

        System.out.print("Enter b:");
        int b = sc.nextInt();
        
        System.out.print("Enter c:");
        int c = sc.nextInt();

        int maximum;
        if (a > b && a > c) {
            maximum = a;
        } else if (b > a && b > c){
            maximum = b;
        }
        else
        {
            maximum = c;
        }

        System.out.println("The maximum of " + a + ","+ b + " and " + c + " is: " +  maximum);

        sc.close();
    }
}