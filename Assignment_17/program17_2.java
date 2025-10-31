/**
 * Class Name: Logic
 * Description: Contains the business logic to check for palindrome numbers.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: checkPalindrome
     * Description: Accepts an integer and checks whether it is a palindrome or not.
     *    num   The number to be checked.
     */
    void checkPalindrome(int num) 
    {   
        String iPnum = "";
        String sNum = String.valueOf(num);
        while (num != 0) 
        {
            iPnum += (num % 10);
            num /= 10;
        }
        if(iPnum.equals(sNum))
        {
            System.out.println("it is a palindrome");
        }
        else
        {
            System.out.println("it is not a palindrome");
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
        obj.checkPalindrome(121);
    }
}