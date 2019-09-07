import javax.swing.JOptionPane;
import java.text.NumberFormat;

/**
 *
 * @author Tyler
 */
public class SalesTax
{
    
    public static void main(String[] args)
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String amountAsString = JOptionPane.showInputDialog("Enter your purchase amount");
        final float stateTaxRate = .04F;
        final float countyTaxRate = .02F;
        
        try
        {
           float purchaseAsFloat = Float.parseFloat(amountAsString); 
           float stateTaxAmount = purchaseAsFloat * stateTaxRate;
           float countyTaxAmount = purchaseAsFloat * countyTaxRate;
           float total = purchaseAsFloat + stateTaxAmount + countyTaxAmount;
           
           System.out.println("Your purchase total was: " + formatter.format(purchaseAsFloat));
           System.out.println("State tax total: " + formatter.format(stateTaxAmount));
           System.out.println("County tax total: " + formatter.format(countyTaxAmount));
           System.out.println("Your total is: " + formatter.format(total));
        }
        catch(NumberFormatException a)
        {
           System.out.println("Invalid input");
        }
       
    }
}
