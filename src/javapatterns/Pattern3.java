//*****
//  ****
//    ***
//      **
//        *
package javapatterns;
public class Pattern3 
{
    public static void main(String[] args)
    {
        int n=5;
        int nst=5;
        int nsp=0;
        int rows=1;
        
        while(rows<=n)
        {
            int csp=1;
            
            while(csp<=nsp)
            {
                System.out.print(" ");
                csp++;
            }
            
            int cst=1;
            while(cst<=nst)
            {
                System.out.print("*");
                cst++;
            }
            
            System.out.println();
            rows++;
            nst--;
            nsp=nsp+2;
        }
    }
}
