package Java;

public class CharPattern {
    public static void main(String[] args) {
        
        char i,j;

        for(i='A'; i<='E';i++)
        {
            for(j='A';j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("\n");
        }
    }
    
}


A

AB

ABC

ABCD

ABCDE
