package file_handeling;

import javax.swing.*;
import java.io.*;

public class rename {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\sahuc\\OneDrive\\Desktop\\file_hendling\\first.txt");
        File r = new File("C:\\Users\\sahuc\\OneDrive\\Desktop\\file_hendling\\first1.txt");
        if (f.exists()) {
            System.out.println(f.renameTo(r));
        }
        else {
            System.out.println("file not exist");
        }
    }
}