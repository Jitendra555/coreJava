package com.jeet.prime;

import java.util.*;
 
class PrimeNumbers
{
   public static void main(String args[])
   {
      int n, status = 1, num = 3;
 
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the number of prime numbers you want :");
      n = s.nextInt();
 
      if (n >= 1)
      {
         System.out.print("First "+n+" prime numbers are : ");
         System.out.print(2);
      }
 
      for ( int count = 2 ; count <=n ;  )
      {
         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
         {
            if ( num%j == 0 )
            {
               status = 0;
               break;
            }
         }
         if ( status != 0 )
         {
            System.out.print(" "+num);
            count++;
         }
         status = 1;
         num++;
      }         
   }
}