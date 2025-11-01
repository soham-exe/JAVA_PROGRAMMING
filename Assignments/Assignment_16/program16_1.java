/**
 * Class Name: Logic
 * Description: Contains the business logic to perform calculations.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: calculateSum
     * Description: Accepts an integer N and calculates the sum of the first N natural numbers.
     * n  The limit up to which the sum should be calculated.
     */
    void calculateSum(int n) 
    {   
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1;iCnt <= n;iCnt++)
        {
            iSum += iCnt;
        }
        System.out.println(iSum);
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
        obj.calculateSum(10);
    }
}