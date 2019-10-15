//run:
//    1
//   202
//  30003
// 4000004
//500000005
public class Pattern11 
{
    public static void main(String[] args)
    {
        int n=5;
        int rows=1;
        int nst=1;
        int nsp=n-1;
        int val=1;
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
                 if( cst==1 || cst==nst)
                {
                    System.out.print(val);
                }
                else
                {
                    System.out.print(0);
                }
                cst++;
            }
            System.out.println();
            nsp--;
            nst+=2;
            rows++;
            val++;
        }
    }
}
