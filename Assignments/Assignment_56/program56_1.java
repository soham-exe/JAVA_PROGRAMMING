import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Description   : Checks if the file exists or not
//  Input         : Nothing
//  Output        : Nothing
//  Author        : Soham Sachin Sonar
//  Date          : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////

class program56_1
{
    public static void main(String[] args)
    {
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the Name of the file that you want to open: ");
        String FileName = Sobj.nextLine();
    
        File Obj = new File(FileName);
        
        if(Obj.exists())
        {
            System.out.println("File Opened Successfully!\n");
        }
        else
        {
            System.err.println("File Not Found Exception\n");
        }
        
        Sobj.close();
    }
}