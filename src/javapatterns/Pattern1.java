//*
//**
//***
//****
//*****
//******

//Pattern-1

package javapatterns;
public class Pattern1 
{
    
    public static void main(String[] args)
    {
        int n=6;
        int rows=1;
        int nst=1;
        while(rows<=n)
        {
            int cst=1;
            while(cst<=nst)
            {
                System.out.print("*");
                cst++;
            }
            System.out.println();
            nst++;
            rows++;
        }
    }
}
