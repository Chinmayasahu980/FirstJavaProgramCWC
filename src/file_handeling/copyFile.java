package file_handeling;

import java.io.*;

public class copyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("C:\\Users\\sahuc\\OneDrive\\Desktop\\file_hendling\\first1.txt");
        FileOutputStream w = new FileOutputStream("C:\\Users\\sahuc\\OneDrive\\Desktop\\file_hendling\\first2.txt");
                int i;
        while((i=r.read())!=-1)
        {
            w.write((char)i);
        }
        System.out.println("data copyed Successfully..!");
    }
}
