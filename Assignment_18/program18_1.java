/**
 * Class Name: Logic
 * Description: Contains the business logic to check for prime numbers.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: checkPrime
     * Description: Accepts an integer and checks whether it is a prime number or not.
     *    num   The number to be checked.
     */
    void checkPrime(int num) 
    {   
        int iCnt = 0;
        if(num <= 1)
        {   
            System.out.println(num+" is not a prime number");
            return;
        }
        for(iCnt = 2;iCnt <= (num / 2);iCnt++)
        {
            if(num % iCnt == 0)
            {
                System.out.println(num+" is not a prime number");
                return;
            }
        }
        
        System.out.println(num+" is a prime number");
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
        obj.checkPrime(11);
    }
}