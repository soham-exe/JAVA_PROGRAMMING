import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Description   : appends given data to the file
//  Input         : nothing
//  Output        : nothing
//  Author        : Soham Sachin Sonar
//  Date          : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////

class program56_3
{
    public static void main(String[] args)
    {
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the File Name: ");
        String FileName = Sobj.nextLine();
        System.out.println("Enter the Data to write: ");
        String data = Sobj.nextLine();
        try
        {
            FileWriter writer = new FileWriter(FileName,true);
            writer.append(data);
            writer.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found!\n"+e);
        }        
        catch(IOException e)
        {
            System.out.println("an error occured!\n"+e);
        }        
        Sobj.close();
    }
}