//* * * * *
//* * * *
//* * * 
//* *
//*
package javapatterns;
public class Pattern2 
{
    public static void main(String[] args)
  {
      int n=5;
      int rows=1;
      int nst=n-1;
      while(rows<=n)
      {
          int cst=1;
          while(cst<=nst)
          {
              System.out.print("*");
              cst++;
          }
          System.out.println();
          nst--;
          rows++;
          
      }
      
  }
}
