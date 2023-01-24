package Java;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        
        int term, a=0, b=1, c;

        System.out.print("Enter term");

        Scanner  r = new Scanner (System.in);
        term = r.nextInt();

        for (int i=1;i<=term;i++){
            System.out.print(a+ " ");
            c=a+b;
            a=b;
            b=c;
        }
    }
    
}

// Enter term10
// 0 1 1 2 3 5 8 13 21 34
