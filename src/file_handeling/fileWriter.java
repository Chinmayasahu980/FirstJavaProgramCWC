package file_handeling;

import java.io.*;
public class fileWriter{
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("C:\\Users\\sahuc\\OneDrive\\Desktop\\file_hendling\\first.txt");
            try
            {
                f.write("java programing language is a best language");
            }
            finally
            {
                f.close();
            }
            System.out.println("Succesfully Data wrote in file");
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
}