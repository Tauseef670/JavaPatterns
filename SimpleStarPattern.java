package Java;

public class SimpleStarPattern {
    public static void main(String[] args) {
        
        // 5 rows and 5 columns

        int i,j;
        for(i=1;i<=5;i++)
        {
            for( j=1;j<=i;j++)
            {
                System.out.print("*");
            
            }
            System.out.print("\n");
        }
    }
    
}
