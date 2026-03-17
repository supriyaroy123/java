import java.util.Scanner;

public class reverse {
    int b=0;
    int c;
    Scanner scanner = new Scanner(System.in);

    public void rev() {
        System.out.print("Enter input : ");
        int n = scanner.nextInt();

        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        } 
        System.out.println("Reversed Number:"+ rev); 
    }
public static void main(String args[]) 
{
        reverse r1 = new reverse();
        r1.rev();
}
}