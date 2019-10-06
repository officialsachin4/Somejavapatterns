//1     1
// 2   2
//  3 3
//   4
//  3 3
// 2   2
//1     1
package javapatterns;
public class Pattern8 
{
    public static void main(String[] args)
    {
        int n=4;
        int rows=1;
        int nst=1;
        int nsp1=0;
        int nsp2=n+1;
        
        while(rows<=2*n-1)
        {
            int csp1=1;
            while(csp1<=nsp1)
            {
                System.out.print(" ");
                csp1++;
            }
            int cst=1;
            while(cst<=nst)
            {
                System.out.print("*");
                cst++;
            }
            int csp2=1;
            while(csp1<=nsp2)
            {
                System.out.print(" ");
                csp1++;
            }
            if(rows==n)
            {
                cst=2;
            }
            else
            {
               cst=1;
            }
            while(cst<=nst)
            {
                System.out.print("*");
                cst++;
            }
            System.out.println();
            if(rows<n)
            {
                nsp1++;
                nsp2-=2;
            }
            else
            {
                nsp1--;
                nsp2+=2;
            }    
           
            rows++;
        }
    }
}
