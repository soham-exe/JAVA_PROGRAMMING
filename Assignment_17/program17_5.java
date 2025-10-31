/**
 * Class Name: Logic
 * Description: Contains the business logic to print a multiplication table.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: printTable
     * Description: Accepts an integer and prints its multiplication table.
     *    num   The number for which the table will be printed.
     */
    void printTable(int num) 
    {
        int iCnt = 0;
        for(iCnt = 1;iCnt <= 10;iCnt++)
        {
            System.out.println(num*iCnt);
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
        obj.printTable(5);
    }
}