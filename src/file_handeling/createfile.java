package file_handeling;
import  java.io.*;
public class createfile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\sahuc\\OneDrive\\Desktop\\file_hendling\\first.txt");
        try
        {
            if(f.createNewFile())
            {
                System.out.println("file successfully Create..!");
            }
            else
            {
                System.out.println("File Already Exist..!");
            }
        }
        catch(IOException i)
        {
            System.out.println("Exception Handled..!");
        }
    }
}
