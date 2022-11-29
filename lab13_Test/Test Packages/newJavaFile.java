
package com.mycompany.week13_testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author badar
 */
public class newJavaFile {
    CheckSum p;
    public newJavaFile() {
        this.p = new CheckSum();
    }
    
    @Test
    public void testisPrime() {
        int number = 40;
        
        
        assertEquals("Has Five", p.hasFive(40));
    }

    @Test
    public void testisPrime1() {
        int num=10;
       
        assertEquals("Valid", p.isPrime(5));
       
        
    }
    
       @Test
    public void testisPrime2() {
    
        assertEquals("Invalid", p.isPrime(2));
       
        
    }
}

