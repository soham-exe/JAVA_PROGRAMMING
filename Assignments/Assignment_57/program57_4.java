import java.io.*;
import java.security.MessageDigest;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Description   : calculate checksum
//  Input         : nothing
//  Output        : nothing
//  Author        : Soham Sachin Sonar
//  Date          : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////

class program57_4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String FileName = sobj.nextLine();
        sobj.close();
        
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            FileInputStream fis = new FileInputStream(FileName);
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            while ((bytesRead = fis.read(buffer)) != -1) 
            {
                md.update(buffer, 0, bytesRead);
            }
            fis.close();

            
            byte[] hashBytes = md.digest();

            
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) 
            {
                // making hex
                sb.append(String.format("%02x", b));
            }
            
            System.out.println("File Checksum: " + sb.toString());
        }
        catch(FileNotFoundException e)
        {
            System.err.println("File not found! " + e.getMessage());
        }
        catch(Exception e)
        {
            System.err.println("Error calculating checksum: " + e.getMessage());
        }
    }
}