
package edu.farmingdale.lab13_test;

/**
 *
 * @author Badar Ansari
 */
public class CheckSum {

    
    public static boolean hasFive(int numCheck) {
        int rest = numCheck % 10;
        return rest == 5;
    } 
 
    
    public String isPrime(int num){
        
        
        for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
          return "It is prime";
        }else if(num % i != 0){
            return "not prime";
        } 
        
    
        
    
        }
        return "Invalid";
    }
}
    

