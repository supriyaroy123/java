import java.util.Scanner;

public class pract1 {
    int a = 0;
    int b = 1;
    int c;
    Scanner scanner = new Scanner(System.in);

    public void fib() {
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            a = a + b;
            b = a - b;
        }
    }

    public static void main(String args[]) {
        pract1 p1 = new pract1();
        p1.fib();
    }
}