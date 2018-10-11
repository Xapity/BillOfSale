/*  Callum MacLeod, 
    September 17th 2018
    Cost of a carpet for U2A1
 */

package billofsale;

/**
 *
 * @author camac2045
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double payed, cost, total, change, tax;
           
        cost = 12.49;
        tax = 0.13*cost;
        payed = 20.00;
        total = cost + tax;
        change = payed-total;
        
        System.out.println("The amount payed was $" + payed);
        System.out.println("The purchas price is $" + total);
        System.out.println("The tax payed is $" + tax);
        System.out.println("The amount returned is $" + change);
         
    }
    
}
