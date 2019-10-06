//1 2 3 4 5
//1 2 3 4 
//1 2 3
//1 2
//1
package javapatterns;
public class Pattern4 
{
    public static void main(String[] args)
    {
        int n=5;
        int nst=n;
        int rows=1;
        
        while(rows<=n)
        {   
            int val=1;
            int cst=1;
            while(cst<=nst)
            {
                System.out.print(val);
                val++;
                cst++;
            }
            System.out.println();
            nst--;
            rows++;
        }
    }
}
