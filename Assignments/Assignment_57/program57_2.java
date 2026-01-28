import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Description   : checks if specified file is regular or not
//  Input         : nothing
//  Output        : nothing
//  Author        : Soham Sachin Sonar
//  Date          : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////

class program57_2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String FileName = sobj.nextLine();
        File f = new File(FileName);

        if(f.exists())
        {
            if(f.isFile())
            {
                System.out.println(FileName+" is a Regular File.\n");
            }
            else
                System.out.println(FileName+" is not a Regular File.\n");
        }
        else
            System.out.println("no such file in the directory!\n");
        sobj.close();
    }
}