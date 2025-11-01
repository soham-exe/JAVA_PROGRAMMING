/**
 * Class Name: Logic
 * Description: Contains the business logic to calculate the product of digits of a number.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: productOfDigits
     * Description: Accepts an integer and calculates the product of its digits.
     *   num   The number to be processed.
     */
    void productOfDigits(int num) 
    {
        int iPro = 1;
        int iDig = 0;
        while (num != 0) 
        {
            iDig = (num % 10);
            
            if(iDig == 0)
            {
                System.out.println(0);
                return;
            }
            iPro *= iDig;
            num /= 10;
        }
        System.out.println(iPro);
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
        obj.productOfDigits(234);
    }
}