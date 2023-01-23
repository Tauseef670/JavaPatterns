package Java;

public class NumberPattern2 {
    public static void main(String[] args) {
        
        int i,j;
        for(i=1;i<=5;i++)  // Rows
        {
            for(j=1;j<=i;j++) // Columns
            {
                System.out.print(i);
            }
            System.out.println("\n");
        }
    }
    
}
