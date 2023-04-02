
/**
 * factorial, fibonacci, printPyramidNumbers, gcd and lengthOfCollatzSeq

 * Burak Once

 * burakonce9@gmail.com
*/


import java.util.Scanner;

public class MyMath {

    
    public long factorial(int n)
    {
        int a1=n ;  
        long fact=1 ;
        
        if(n==0)
        return 1;
        
        else
        {
            while(a1>0)
            {
            fact*=a1;
            a1--;
            }
        }
        return fact;
    }
    
    public long fibonacci(int n){
        
        if(n<=1)
        return n;
    
        return (fibonacci(n-2)+fibonacci(n-1)); //recusive ile fonksiyon tekrar tekrar cagrilir
        
    }
    
    void printPyramidNumbers(int n)
    {
        for(int x=1; x<=n; x++) 
        {

            for(int z=1; z<=x; z++) 
            System.out.printf("%d",z); 

            System.out.printf("\n");

        }
    
    }
    
    int gcd(int a, int b)
    {
        int g;
        if(a==0 && b>0)
        return b;
        
        if(b==0 && a>0)
        return a;
        
        if(b==0 && a==0)
        return 0;
        
            while(a>b)
            {
            if(a%b==0)
            return b;
            
            else
            g=a%b;
            if(b%g==0)
            return g;
            }
            
                while(b>a)
                {
                if(b%a==0)
                return a;
            
                else
                g=b%a;
                
                if(a%g==0)
                return g;
                }
      
    return 0;
    }
    
    int lengthOfCollatzSeq(int n)
    {
          int i=0;
        while(n>1){
            
            while(n%2==0){
                n=n/2;
                i++;
            }
            while(n%2==1 && n>1){ //n>1 olmaz ise sonsuz dongu olur
                n=(3*n)+1;
                i++;
            }
            
        }
        return i+1;
}
}