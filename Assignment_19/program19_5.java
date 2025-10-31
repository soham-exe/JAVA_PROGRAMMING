/**
 * Class Name: Logic
 * Description: Contains the business logic to calculate the power of a number.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: calculatePower
     * Description: Accepts a base and an exponent and calculates the power of the number using loops.
     *   base   The base number.
     *   exp    The exponent.
     */
    void calculatePower(int base, int exp) 
    {
        int iPow = 1;
        
        int iCnt = 0;

        for(iCnt = 1;iCnt <= exp;iCnt++)
        {
            iPow *=base;
        }
        System.out.println(iPow);
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
        obj.calculatePower(2, 5);
    }
}