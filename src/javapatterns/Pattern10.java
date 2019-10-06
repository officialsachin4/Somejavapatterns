//run:
//         1
//       2 3 4
//     5 6 7 8 9
//   10 11 12 13 14 15 16
// 17 18 19 20 21 22 23 24 25
package javapatterns;
public class Pattern10 
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
                System.out.print("  ");
                csp++;
            }
            
            int cst=1;
            while(cst<=nst)
            {
                System.out.print(" "+val);
                cst++;
                val++;
            }
            
            System.out.println();
            nst+=2;
            nsp--;
            rows++;
            
        }
    }
}
