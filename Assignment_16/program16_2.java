/**
 * Class Name: Logic
 * Description: Contains the business logic for number operations.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: checkEvenOdd
     * Description: Accepts an integer and checks whether it is even or odd.
     *  num   The number to be checked.
     */
    void checkEvenOdd(int num) 
    {
        if(num % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
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
        obj.checkEvenOdd(7);
    }
}