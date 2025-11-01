/**
 * Class Name: Logic
 * Description: Contains the business logic to find the largest digit in a number.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: findLargestDigit
     * Description: Accepts an integer and finds the largest digit within it.
     *   num   The number to be processed.
     */
    void findLargestDigit(int num) 
    {
        int ilargest = 0;
        int iDig = 0;
        while (num != 0) 
        {
            iDig = (num % 10);
            if(iDig > ilargest)
            {
                ilargest = iDig;
            }
            num /= 10;
        }
        System.out.println(ilargest);
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
        obj.findLargestDigit(83429);
    }
}