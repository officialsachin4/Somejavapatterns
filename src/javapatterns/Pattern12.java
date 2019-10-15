//11
//131
//1441
//15551
//166661
public class Pattern12 
{
    public static void main(String[] args)
    {
        int n=6;
        int rows=1;
        int nst=1;
        int val=1;
        while(rows<=n)
        {
            int cst=1;
            while(cst<=nst)
            {
                if(cst==1 || cst==nst)
                {
                    System.out.print(1);
                }
                else
                {
                  System.out.print(val);  
                }
                
                cst++;
            }
            System.out.println();
            val++;
            nst++;
            rows++;
        }
    }
}
