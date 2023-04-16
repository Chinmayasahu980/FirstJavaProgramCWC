package file_handeling;
import java.io.File;
public class fileInfo {
    public static void main(String[]args)
    {
        File f = new File("C:\\Users\\sahuc\\OneDrive\\Desktop\\file_hendling\\first.txt");
        if(f.exists())
        {
            System.out.println("file name :" + f.getName());
            System.out.println("file location :" + f.getAbsoluteFile());
            System.out.println("file readable :" + f.canRead());
            System.out.println("file writeable:" + f.canWrite());
            System.out.println("file size :" + f.length());
            System.out.println("file Removed :" + f.delete());
        }
        else {
            System.out.println("File dosen't exist");
        }
    }
}
