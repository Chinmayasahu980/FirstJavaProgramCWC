package file_handeling;

import java.io.*;
public class fileReader {
    public static void main(String[] args) throws IOException {

            FileReader r = new FileReader("C:\\Users\\sahuc\\OneDrive\\Desktop\\file_hendling\\first.txt");


                int i;
                while((i=r.read())!=-1)
                {
                    System.out.println((char) i);
                }

    }
}
