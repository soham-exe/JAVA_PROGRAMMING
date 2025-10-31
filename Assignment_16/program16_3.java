/**
 * Class Name: Logic
 * Description: Contains the business logic for mathematical operations like factorial.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: findFactorial
     * Description: Accepts an integer and finds its factorial using a for loop.
     *  num   The number whose factorial is to be calculated.
     */
    void findFactorial(int num) 
    {
        int iCnt = 0;
        int iFact = 1;
        for(iCnt = 1;iCnt <= num;iCnt++)
        {
            iFact *= iCnt;
        }
        System.out.println(iFact);
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
        obj.findFactorial(5);
    }
}