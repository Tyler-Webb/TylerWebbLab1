import javax.swing.JOptionPane;
/**
 *
 * @author Tyler
 */
public class CookieCalories 
{
    public static void main(String[] args) 
    {
        try
        {
            String numberOfCookies = JOptionPane.showInputDialog("How many cookies did you eat?");
            float cookiesAsFloat = Float.parseFloat(numberOfCookies); //in case you are a weirdo who leaves behind part of a cookie
            float bagCapacity = 40F;
            float servingsPerBag = 10;
            float servingOfCookies = bagCapacity / servingsPerBag;
            float caloriesPerServing = 300;
            float caloriesPerCookie = caloriesPerServing / servingOfCookies;
            float caloriesEaten = caloriesPerCookie * cookiesAsFloat;
            
            System.out.println("You ate " + cookiesAsFloat + " cookies containing " + caloriesEaten + " calories." );
            
            
            
        }
        catch(NumberFormatException a)
        {
            System.out.println("Invalid input");
        }
    }
}
