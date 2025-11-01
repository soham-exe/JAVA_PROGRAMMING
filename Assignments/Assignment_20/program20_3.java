/**
 * Class Name: Logic
 * Description: Contains the business logic to check for perfect numbers.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: checkPerfect
     * Description: Accepts an integer and checks whether it is a perfect number or not.
     *    num   The number to be checked.
     */
    void checkPerfect(int num) 
    {
        int iSum = 0;
        int iCnt = 0;

        for(iCnt = 1;iCnt <= (num/2);iCnt++)
        {   
            if(num % iCnt == 0)
            {    
                iSum += iCnt;
            }
        }
        if(num == iSum)
        {
        System.out.println(num+" is a perfect number");
        }
        else
        {
            System.out.println(num+" is not a perfect number");
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
        obj.checkPerfect(6);
    }
}