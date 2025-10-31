
/**
 * Class Name: Logic
 * Description: Contains the business logic to display the factors of a number.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: displayFactors
     * Description: Accepts an integer and displays all of its factors.
     *    num   The number whose factors are to be displayed.
     */
    void displayFactors(int num) 
    {
        int iCnt = 0;

        for(iCnt = 1;iCnt <= (num/2);iCnt++)
        {
            if(num % iCnt == 0)
            {
                System.out.print(iCnt+" ");
            }
        }
        System.out.print(num);
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
        obj.displayFactors(12);
    }
}