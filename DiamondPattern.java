package Java;

public class DiamondPattern {
    public static void main(String[] args) {
        
        int i,j,k;

        for(i=1;i<=5;i++)  // Rows---
        {
            for(j=5;j>i;j--)  // Space/ column
            {
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        for(i=4;i>=1;i--)  // Rows---
        {
            for(j=5;j>i;j--)  // Space/ column
            {
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
    
}


    *

   ***

  *****

 *******

*********

 *******

  *****

   ***

    *
