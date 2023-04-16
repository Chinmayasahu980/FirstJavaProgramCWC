package file_handeling;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
public class writepw {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\sahuc\\OneDrive\\Desktop\\file_hendling\\first1.txt") ;
        PrintWriter pw = new PrintWriter(fos);
            pw.println("hii");
            pw.println("namaste");
            pw.println("juhar");
            pw.println("good night");

        
    }
}