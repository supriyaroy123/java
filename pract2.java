// checking pallindrome
import java.util.Scanner;

public class pract2 {
    int a;
    int b=0;
    int c;
    Scanner scanner = new Scanner(System.in);

    public void pallindrome() {
        while (true){
        System.out.print("Enter n : ");
        int n = scanner.nextInt();

        int ori = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
    if (ori == rev)
    {
        System.out.println("Pallindrome");
    }
    else
    {
        System.out.println("Not Pallindrome");
    }

}
    }
    public static void main(String args[]) {
        pract2 p1 = new pract2();
        p1.pallindrome();
    }
}
