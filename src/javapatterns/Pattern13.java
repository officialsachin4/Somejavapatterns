public class Pattern13 
{
     public static void main(String[] args)
    {
        int n=5;
        int nst=1;
        int nsp=n-1;
        int rows=1;
        
        while(rows<=2*n-1)
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
            
            if(rows<n)
            {
                nsp--;
                nst++;
            }
            else
            {
                nsp++;
                nst--;
            }
            
            rows++;
        }
        
        }
}
