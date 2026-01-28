import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Description   : creates new directory
//  Input         : nothing
//  Output        : nothing
//  Author        : Soham Sachin Sonar
//  Date          : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////

class program57_3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String FileName = sobj.nextLine();
        File f = new File(FileName);

        if(f.isDirectory())
        {
            System.out.println("directory already exists!\n");
        }
        else
        {
            f.mkdir();
            System.out.println("New directory created!\n");
        }
        sobj.close();
    }
}