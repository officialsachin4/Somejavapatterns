//    *
//   *!*
//  *!*!*
// *!*!*!*
//*!*!*!*!*
package javapatterns;
public class Pattern9 
{
    public static void main(String[] args)
    {
        int n=5;
        int rows=1;
        int nst=1;
        int nsp=n-1;
        
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
                 if(cst%2==1)
                    
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("!");
                }
                
                cst++;
            }
            System.out.println();
            
            nst+=2;
            rows++;
            nsp--;
        } 
    }
}
