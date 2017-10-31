
package exercicio5psp;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mblancosoto
 */
public class Exercicio5Psp {

   
    public static void main(String[] args) throws InterruptedException {
     Fios f = new Fios("1");
     Fios f2 = new Fios("2");
     f.setPriority(MAX_PRIORITY);
     f2.setPriority(MIN_PRIORITY);
     f2.start();
     f2.join();
     f.start();
    
     
  
    
    
        
    }
    
}
