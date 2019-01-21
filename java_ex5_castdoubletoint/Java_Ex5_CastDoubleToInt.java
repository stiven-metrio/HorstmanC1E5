/**
 * Cay S. Horstmann -- Chapter 1
 * Exercise #5
 * What happens when you cast a double to an int that is larger than the 
 * largest possible int value? Try it out.
 */
package java_ex5_castdoubletoint;

/**
 *
 * @author jhonatan
 */
public class Java_Ex5_CastDoubleToInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intValue;
        double doubleValue = 3000000000.0;
        intValue = (int) doubleValue;
        System.out.println(intValue);
        
        /**
         * If we try to cast a number bigger than any type int to int,
         * it prints the largest int.
         */
    }
    
}
