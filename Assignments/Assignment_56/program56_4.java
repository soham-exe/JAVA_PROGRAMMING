import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Description   : creates a file if it does not exist already
//  Input         : nothing
//  Output        : nothing
//  Author        : Soham Sachin Sonar
//  Date          : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////

class program56_4
{
    public static void main(String[] args)
    {
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the File Name: ");
        String FileName = Sobj.nextLine();
        try
        {
            File f = new File(FileName);
            if(f.exists())
            {
                System.out.println("File already exists!\n");
            }
            else
            {
                f.createNewFile();
                System.out.println("File "+FileName+" got created!\n");
            }

        }    
        catch(IOException e)
        {
            System.out.println("an error occured!\n"+e);
        }        
        Sobj.close();
    }
}