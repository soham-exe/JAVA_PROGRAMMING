/**
 * Class Name: Logic
 * Description: Contains the business logic to find the smallest digit in a number.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: findSmallestDigit
     * Description: Accepts an integer and finds the smallest digit within it.
     *    num   The number to be processed.
     */
    void findSmallestDigit(int num) 
    {
        int iSmallest = 10;
        int iDig = 0;
        while (num != 0) 
        {
            iDig = (num % 10);
            if(iDig < iSmallest)
            {
                iSmallest = iDig;
            }
            num /= 10;
        }
        System.out.println(iSmallest);
    }
}

/**
 * Class Name: Program
 * Description: The main class to run the application.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Program 
{
    /**
     * Entry point function for the application
     */
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}